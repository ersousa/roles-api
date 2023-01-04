FROM openjdk:11

ARG PROFILE
ARG ADDITIONAL_PTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_PTS=${ADDITIONAL_PTS}

WORKDIR /opt/roles_api

COPY /target/roles-api*.jar roles_api.jar

SHELL ["/bin/sh", "-c"]

EXPOSE 5005
EXPOSE 8080

CMD java ${ADDITIONAL_OPTS} -jar roles_api.jar --spring.profiles.active=${PROFILE}
