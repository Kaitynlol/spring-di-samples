package com.openbank.di.demo.service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class NotificationService {
    private List<NotifChannel> channelList;

    @Setter
    private int count;
    public void notify(final String message, final String clientType){
        channelList.stream().filter(c->c.getClientType().equalsIgnoreCase(clientType)).forEach(c->c.notify(message));

    }
}

