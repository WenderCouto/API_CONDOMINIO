package com.condominio.app.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * AppWebApplication class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@SpringBootApplication(scanBasePackages = "com.condominio")
@EnableJpaRepositories(basePackages = "com.condominio.app.persistence.repository")
@EntityScan(basePackages = "com.condominio.app.persistence.entity")
public class AppWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppWebApplication.class, args);
    }
}