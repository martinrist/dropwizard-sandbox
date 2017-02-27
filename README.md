# Dropwizard Sandbox

A sandbox application to experiment with [Dropwizard](http://www.dropwizard.io)

## How to start the Sandbox application

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/dropwizard-sandbox-0.0.1-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`


## Health Check

To see your applications health enter url `http://localhost:8081/healthcheck`


## Logging Levels

To change logging levels, run

```
curl -X POST -d "logger=$LOGGER&level=$LEVEL" http://localhost:8081/tasks/log-level
```

where:

- `$LOGGER` is the name of the logger whose level is to be changed, e.g. `com.martinrist.sandbox`.
- `$LEVEL` is the desired logging level, e.g. `DEBUG`