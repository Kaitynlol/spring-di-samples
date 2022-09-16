package com.openbank.di.demo;

import com.openbank.di.demo.service.NotificationService;
import com.openbank.di.demo.service.SomethingCaller;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class CommandLineAppStartupRunner implements CommandLineRunner {
    @Autowired
    private NotificationService notificationService;
    @Override
    public void run(final String... args) throws Exception {
        notificationService.notify("Typical","MASS");
    }
}
