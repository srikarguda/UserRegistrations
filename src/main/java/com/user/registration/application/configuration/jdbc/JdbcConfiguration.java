package com.user.registration.application.configuration.jdbc;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.stereotype.Component;

@Component
public class JdbcConfiguration {

    
    @Autowired
    private DataSourceProperties dataSourceProperties;

  
    @Bean
    public NamedParameterJdbcOperations ravenNamedParameterJdbcOperations() throws SQLException {
        NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(dataSource());
        return jdbcTemplate;
    }

   @Bean
    public DataSource dataSource() throws SQLException {
        DriverManagerDataSource dataSource = new SingleConnectionDataSource();
        dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
        dataSource.setUrl(dataSourceProperties.getDbUrl());
        dataSource.setUsername(dataSourceProperties.getDbUsername());
        dataSource.setPassword(dataSourceProperties.getDbPassword());
        dataSource.getConnection().setAutoCommit(true);
        // dataSource.getConnection().setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
        return dataSource;
    }
}
