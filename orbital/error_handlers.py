from fastapi import HTTPException, FastAPI
from starlette.responses import HTMLResponse


def add_api_exception_handler(app: FastAPI):
    @app.exception_handler(404)
    async def exception_404(request, exc: HTTPException):
        return HTMLResponse(content='html_content', status_code=200)
