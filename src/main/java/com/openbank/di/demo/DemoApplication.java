package com.openbank.di.demo;

import com.openbank.di.demo.service.ConstructorDiService;
import com.openbank.di.demo.service.FieldBaseConstructor;
import com.openbank.di.demo.service.LookUpDi;
import com.openbank.di.demo.service.NonBeanService;
import com.openbank.di.demo.service.SetterBaseDiService;
import com.openbank.di.demo.service.SomethingCaller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
      //  SomethingCaller service = applicationContext.getBean(LookUpDi.class);
       // service.doSomething();
    }

}
