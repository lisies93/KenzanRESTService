package com.kenzan.security;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
 
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter
{

	 
    @Override
    protected void configure(HttpSecurity http) throws Exception 
    {
        http
        .csrf().disable()
        .authorizeRequests()
        .antMatchers(HttpMethod.GET, "/api/**").permitAll()
        .antMatchers(HttpMethod.GET, "/**").permitAll() 
        .antMatchers(HttpMethod.PUT, "/api/**").permitAll()
        .antMatchers(HttpMethod.PUT, "/**").permitAll() 
        .antMatchers(HttpMethod.POST, "/api/**").permitAll()
        .antMatchers(HttpMethod.POST, "/**").permitAll() 
        .antMatchers(HttpMethod.DELETE, "/api/**").authenticated() 
        .antMatchers(HttpMethod.DELETE, "/**").authenticated() // Requests for DELETE must be authorized.
                     // All other requests are allowed without authorization.
        .and()
        .httpBasic();
    }
  
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) 
            throws Exception 
    {
        auth.inMemoryAuthentication()
            .withUser("kenzan")
            .password("{noop}kenzan")
            .roles("USER");
    }
}