package com.hoolark.bpm.activiti.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 一些工具bean
 * @author Administrator
 *
 */
@Configuration
public class Cfg_Util {


    //jackson xml util
    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
}
