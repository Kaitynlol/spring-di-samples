package com.openbank.di.demo.service;

public interface NotifChannel {

    void notify(String message);

    String getClientType();
}
