package com.teixeira.fernando.sample.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaListenerExample {

  @KafkaListener(topics = "topic-example", containerFactory = "kafkaListenerContainerFactory")
  public void execute(final GenericMessage<String> message) {
    log.info(
        "Reading offset: {} and message received: {}",
        message.getHeaders().get("kafka_offset"),
        message.getPayload());
    throw new RuntimeException("Ops");
  }
}
