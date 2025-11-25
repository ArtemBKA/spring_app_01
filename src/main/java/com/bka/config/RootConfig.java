package com.bka.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.bka.service", "com.bka.repository"})
public class RootConfig {
    // Здесь будут бины для сервисов, репозиториев и т.д.
    // Пока можно оставить пустым
}