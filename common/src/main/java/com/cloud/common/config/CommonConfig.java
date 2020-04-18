package com.cloud.common.config;

import com.cloud.common.biz.SSBiz;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "common.auto", havingValue = "true", matchIfMissing = true)
@ComponentScan(basePackages = {"com.cloud.common.controller","com.cloud.common.service"})
public class CommonConfig {

   @Bean
   @ConditionalOnMissingBean
   public SSBiz getSSBiz(){
       return new SSBiz();
   }
}
