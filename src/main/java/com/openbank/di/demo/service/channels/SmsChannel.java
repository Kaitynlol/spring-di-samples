package com.openbank.di.demo.service.channels;

import com.openbank.di.demo.service.NotifChannel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Order(2)
@Getter
public class SmsChannel implements NotifChannel {

    private String clientType = "MASS";

    @Override
    public void notify(final String message) {
        log.info("SMS received: {}",message);
    }
}
