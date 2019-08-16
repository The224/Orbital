"""
Use to load environment variables for the module
"""
import os

try:
    ENVIRONMENT = os.environ.get("ENVIRONMENT", "dev")
except KeyError as ke:
    raise Exception(f"Mandatory environment variable {ke} not found")
