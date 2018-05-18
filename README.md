# spring-kafka-listener-sample

Sample project about Spring Kafka Listener using ErrorHandler if your listener throws an exception.

##### Technologies
* Spring Boot
* Spring Kafka

##### Environment Requirements
* This sample was tested with Apache Kafka 0.10.2 in local installation

##### Apache Kafka Commands
Considering inside Apache Kafka install folder and /bin path

* Starting Zookeeper
```
./zookeeper-server-start.sh ../config/zookeeper.properties
```
* Starting Kafka Server
```
./kafka-server-start.sh ../config/server.properties
```
* Create Topic
```
./kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partition 1 --topic topic-example
```
* List all topics
```
./kafka-topics.sh --list --zookeeper localhost:2181
```
* Checking offset
```
./kafka-consumer-offset-checker.sh --group listener-example --topic topic-example --zookeeper localhost:2181
```
* Sending message
```
./kafka-console-producer.sh --broker-list localhost:9092 --topic topic-example
```
