package com.mikovic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;



import org.springframework.scheduling.annotation.EnableScheduling;



import java.util.Properties;
@Configuration
@PropertySource(value = "classpath:resources") //<context:property-placeholder location=".." />
@ComponentScan(basePackages = "com.mikovic")
@EnableScheduling //task:annotation-driven
public class ApplicationConfig {


    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }













    /**
     *  <bean class="org.springframework.scheduling.quartz.SchedulerFactoryBean">
     */

}
