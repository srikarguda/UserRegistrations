package com.user.registration.application.configuration.jdbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DataSourceProperties {

    private @Value("${userregistration.jdbc.datasource.driver-class-name}") String driverClassName;
    private @Value("${userregistration.jdbc.datasource.url}") String dbUrl;
    private @Value("${userregistration.jdbc.datasource.username}") String dbUsername;
    private @Value("${userregistration.jdbc.datasource.password}") String dbPassword;

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }
    
}
