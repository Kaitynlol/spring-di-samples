package com.openbank.di.demo.config;

import com.openbank.di.demo.printer.FooPrinter;
import com.openbank.di.demo.service.NonBeanService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiConfiguration {

    @Bean
    public NonBeanService nonBeanService() {
        return new NonBeanService(new FooPrinter());
    }
}
