package com.openbank.di.demo.service.channels;

import com.openbank.di.demo.service.NotifChannel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Order(1)
@Getter
public class EmailChannel implements NotifChannel {
    private String clientType = "Private";


    @Override
    public void notify(final String message) {
        log.info("EMAIL received: {}",message);
    }
}
