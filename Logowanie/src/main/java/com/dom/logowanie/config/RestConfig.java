package com.dom.logowanie.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.dom.logowanie.services.BalanceService;
import com.dom.logowanie.services.UserService;
import com.dom.logowanie.template.BalanceJDBCTemplate;
import com.dom.logowanie.template.UserJDBCTemplate;

@Configuration
public class RestConfig {

    @Bean(name="userService")
    public UserService userService(UserJDBCTemplate userJDBCTemplate) {
    	UserService userService = new UserService();
    	userService.setUserJDBCTemplate(userJDBCTemplate);
        return userService;
    }
    
    @Bean(name="userJDBCTemplate")
    public UserJDBCTemplate userJDBCTemplate(DataSource dataSource) {
		UserJDBCTemplate userJDBCTemplate = new UserJDBCTemplate();
		userJDBCTemplate.setDataSource(dataSource);
        return userJDBCTemplate;
    }
    
    @Bean(name="balanceService")
    public BalanceService balanceService(BalanceJDBCTemplate balanceJDBCTemplate) {
    	BalanceService balanceService = new BalanceService();
    	balanceService.setBalanceJDBCTemplate(balanceJDBCTemplate);
        return balanceService;
    }
    
    @Bean(name="balanceJDBCTemplate")
    public BalanceJDBCTemplate balanceJDBCTemplate(DataSource dataSource) {
    	BalanceJDBCTemplate balanceJDBCTemplate = new BalanceJDBCTemplate();
    	balanceJDBCTemplate.setDataSource(dataSource);
        return balanceJDBCTemplate;
    }
    
    @Bean(name="dataSource")
    public DataSource dataSource() {
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
    	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    	dataSource.setUrl("jdbc:mysql://localhost:8806/Logowanie");
    	dataSource.setUsername("logowanie");
    	dataSource.setPassword("logowanie");
		return dataSource;
    }
}
