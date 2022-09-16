package com.openbank.di.demo.service;


import com.openbank.di.demo.printer.Printer;
import com.openbank.di.demo.service.SomethingCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterBaseDiService implements SomethingCaller {

    private Printer printer;

    public void doSomething(){
        printer.printSomething(this.getClass().getName());

    }

    @Autowired
    public void setPrinter(final Printer printer) {
        this.printer = printer;
    }


}
