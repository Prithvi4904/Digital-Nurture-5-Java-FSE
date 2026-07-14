package com.cognizant.springlearn.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@SuppressWarnings("deprecation")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()

                .withUser("user")
                .password("{noop}pwd")
                .roles("USER")

                .and()

                .withUser("admin")
                .password("{noop}pwd")
                .roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http

                .csrf().disable()

                .authorizeRequests()

                .antMatchers("/authenticate").permitAll()

                .antMatchers("/countries/**").authenticated()

                .anyRequest().authenticated()

                .and()

                .httpBasic()

                .and()

                .addFilter(new JwtAuthorizationFilter(authenticationManager()));
    }
}