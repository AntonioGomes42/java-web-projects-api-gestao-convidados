package com.algaworks.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder builder)
            throws Exception {
        builder
                .inMemoryAuthentication()
                .withUser("antonio").password("{noop}250418").roles("USER")
                .and()
                .withUser("wilhyane").password("{noop}250419").roles("USER")
                .and()
                .withUser("aurora").password("{noop}250420").roles("USER");
    }
}