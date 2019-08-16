##
# Orbital Docker Image
###

FROM python:3.7-slim

ARG USER_ID
ARG GROUP_ID

# Add OS dependency
RUN set -ex\
    && apt-get update\
    && apt-get install -y gcc curl busybox git libpq-dev\
    && groupadd ${GROUP_ID:+-g $GROUP_ID} -r orbital\
    && useradd ${USER_ID:+-u $USER_ID} --no-log-init -r -g collabi collabi

COPY ./requirements.txt /tmp/requirements.txt

# Install requirements
RUN set -ex && pip install --verbose -r /tmp/requirements.txt\
    && apt-get remove -y gcc

COPY --chown=orbital:orbital . /app

WORKDIR /app

ENTRYPOINT ["python", "orbital/app.py"]

ENV PYTHONPATH="$PYTHONPATH:/app"

ENV ENVIRONMENT="dev"

RUN set -ex && ls -lh

LABEL maintainer="contact@the224.dev"

EXPOSE 80

CMD ["--help"]
