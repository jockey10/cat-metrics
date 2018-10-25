# cat-metrics

This is a Spring Boot demo that exports Prometheus metrics using Micrometer.

## Deployment

`cat-metrics` is designed to be deployed to OpenShift, using the Red Hat OpenJDK image.
```
oc new-app redhat-openjdk18-openshift:1.3~https://github.com/jockey10/cat-metrics.git
oc expose svc/cat-metrics 
```
You can also test the app locally with Maven:
```
mvn spring-boot:run
```
