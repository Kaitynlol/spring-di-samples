package com.openbank.di.demo.service;

import com.openbank.di.demo.printer.Printer;
import com.openbank.di.demo.printer.PrinterTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class LookUpDi implements SomethingCaller {
    @Autowired
    private Map<String, Printer> printers;

    @Override
    public void doSomething() {
        printers.get(PrinterTypes.NON_FOO.name()).printSomething(this.getClass().getName());

    }
}
