#### Stack description
* Docker
* Docker Compose
* Apache Kafka
* Kotlin
* Spring Boot Web


#### Run project
* First run the docker that contains the specification of zookeeper and kafka, just use the following command
```
$ docker-compose up -d
```

* And then run the aplication using the command
```
$ mvn clean package && java -jar ./target/spring-kafka-demo-0.0.1-SNAPSHOT.jar
```