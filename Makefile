requirements.txt: Pipfile
	pipenv update
	pipenv lock -r > requirements.txt