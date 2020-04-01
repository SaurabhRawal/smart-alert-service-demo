package com.saxo.assignment.config;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;

@Configuration
public class AppConfig {

    @Bean
    public EventBus eventBus() {
        return new AsyncEventBus(Executors.newCachedThreadPool()); // guava event bus
    }
}
