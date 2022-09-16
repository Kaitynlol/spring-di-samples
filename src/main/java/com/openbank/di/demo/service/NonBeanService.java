package com.openbank.di.demo.service;

import com.openbank.di.demo.printer.Printer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@AllArgsConstructor
public class NonBeanService implements SomethingCaller {
    private Printer printer;

    @Override
    public void doSomething() {
        printer.printSomething(this.getClass().getName());
    }

}
