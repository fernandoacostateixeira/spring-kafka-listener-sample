package com.teixeira.fernando.sample.configurations;

import com.teixeira.fernando.sample.listeners.CustomErrorHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.listener.KafkaListenerErrorHandler;

@Configuration
public class KafkaConfiguration {

  @Bean
  public KafkaListenerErrorHandler customErrorHandler() {
    return new CustomErrorHandler();
  }
}
