import uvicorn
from fastapi import FastAPI
from starlette.middleware.cors import CORSMiddleware
from starlette.staticfiles import StaticFiles

from orbital import env
from orbital.controllers import main_controller

app = FastAPI(
    title="Orbital"
)

# Add CORS
app.add_middleware(
    CORSMiddleware,
    allow_methods=["*"],
    allow_origins=["*"],
    allow_credentials=True,
    allow_headers=["*"],
)

# Include other road
app.include_router(main_controller.router)

# Register static folder
app.mount("/", StaticFiles(directory="../static"), name="static")


# Start the server
if __name__ == "__main__":
    if env.ENVIRONMENT != 'dev':
        uvicorn.run(app, host="0.0.0.0", port=8000, access_log=True)
    else:
        uvicorn.run(app, host="0.0.0.0", port=8000, debug=True, access_log=True)



