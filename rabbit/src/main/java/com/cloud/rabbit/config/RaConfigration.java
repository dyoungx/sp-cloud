package com.cloud.rabbit.config;

import com.cloud.common.biz.SSBiz;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RaConfigration {

//    @Bean
    public SSBiz getSSBiz(){
        return new SSBiz("talkeddddd.");
    }
}
