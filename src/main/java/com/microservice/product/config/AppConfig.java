package com.microservice.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration racine de l'application Spring.
 * Active le scan automatique de l'ensemble des composants du microservice.
 */
@Configuration
@ComponentScan(basePackages = "com.microservice.product")
public class AppConfig {
    // Centralise la détection des beans (@Component, @Repository, @Service, @Configuration)
}
