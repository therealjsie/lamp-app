# lamp service

This repository contains the scaffolding for a Dropwizard-based Java-Service.
The goal of this repository is to provide a minimal running version that can be
used with the infrastructure in the
[lamp-infrastructure Repository](https://github.com/therealjsie/lamp-infrastructure).

## Building

### Using maven

1. Run `mvn clean package` to build your application

### Using Docker

Ensure Docker is installed. https://docs.docker.com/get-docker/

1. Run `./build.sh` to build your application

## Start the application

Run `java -jar target/dropwizard-example-1.0-SNAPSHOT.jar server config.yml`

## Calling the service

Once the service is up you can call the root endpoint at port 8080:
`curl localhost:8080`

## Configuration

The servers http port can be set via the env var `APP_PORT`.

You can for example start the application exposing port `9090` like this:
`APP_PORT=9090 java -jar target/dropwizard-example-1.0-SNAPSHOT.jar server config.yml`

# Accessing the service after deployment

The provided service is currently only accessible through a public IP. The IP is
provisioned through an Azure load balancer. The health check can be accessed
like this:

```
export SERVICE_IP=$(kubectl get ingress lamp-http -n lamp -o jsonpath={.status.loadBalancer.ingress[0].ip})
curl http://${SERVICE_IP}/admin/healthcheck
```
