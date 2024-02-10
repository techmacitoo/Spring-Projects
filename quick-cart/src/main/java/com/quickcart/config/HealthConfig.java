package com.quickcart.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HealthConfig {

    @Bean
    public Health customHealth() {
        return Health.up().build();
    }
}
