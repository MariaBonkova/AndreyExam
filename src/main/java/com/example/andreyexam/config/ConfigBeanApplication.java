package com.example.andreyexam.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeanApplication {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
