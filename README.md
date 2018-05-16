# spring-kafka-listener-sample

Sample project about Spring Kafka Listener using ErrorHandler if your listener throws an exception.

##### Technologies
* Spring Boot
* Spring Kafka

##### Environment Requirements
* Apache Kafka 0.10.2 local installation

##### Apache Kafka Commands
Considering inside Apache Kafka install folder and /bin path

* Checking offset
```
./kafka-consumer-offset-checker.sh --group listener-example --topic topic-example --zookeeper localhost:2181
```
* Sending message
```
./kafka-console-producer.sh --broker-list localhost:9092 --topic topic-example
```
