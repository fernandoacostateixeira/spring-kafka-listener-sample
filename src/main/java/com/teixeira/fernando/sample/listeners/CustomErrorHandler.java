package com.teixeira.fernando.sample.listeners;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.ErrorHandler;
import org.springframework.util.ObjectUtils;

@Slf4j
public class CustomErrorHandler implements ErrorHandler {

    @Override
    public void handle(Exception thrownException, ConsumerRecord<?, ?> data) {
        log.error("Error while processing: " + ObjectUtils.nullSafeToString(data), thrownException);
    }
}
