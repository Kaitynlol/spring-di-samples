package com.openbank.di.demo.service;

import com.openbank.di.demo.printer.Printer;
import com.openbank.di.demo.service.SomethingCaller;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConstructorDiService implements SomethingCaller {


    @Qualifier("FOO")
    private final Printer printer;

    public void doSomething(){
        printer.printSomething(this.getClass().getName());
    }


}
