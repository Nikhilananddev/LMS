package com.lms.LMS.config;


import com.lms.LMS.eventhandle.EventHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RepositoryConfiguration {

    public RepositoryConfiguration() {
        super();
    }

    @Bean
    EventHandler EventHandler() {
        return new EventHandler();
    }


}