package com.openbank.di.demo.service;

import com.openbank.di.demo.printer.FooPrinter;
import com.openbank.di.demo.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldBaseConstructor implements SomethingCaller {

private static String ASD= "asd";
    private Printer printer = new FooPrinter();

    private boolean a = true;

    @Override
    public void doSomething() {
        printer.printSomething(this.getClass().getName());
    }
}
