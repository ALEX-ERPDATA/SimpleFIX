package com.github.javadev.simplefix.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
class PersistenceConfiguration {
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}
