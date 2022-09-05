package com.hamidworks.SpringPractices.config;

import com.hamidworks.SpringPractices.services.PaymentRegistry;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceLocatorConfiguration {

    @Bean
    public FactoryBean<?> getBean(){
        ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
        bean.setServiceLocatorInterface(PaymentRegistry.class);
        return bean;
    }
}
