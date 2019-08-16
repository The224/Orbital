from fastapi import APIRouter

router = APIRouter()


@router.get("/")
def main_page():
    return {"msg": "Hello from cluster"}


@router.get("/")
def main_page():
    return {"msg": "Hello from cluster"}