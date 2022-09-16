package com.openbank.di.demo.printer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("FOO")
@Primary
@Slf4j
public class FooPrinter implements Printer{
    private PrinterTypes name = PrinterTypes.FOO;
    @Override
    public void printSomething(final String value) {
        log.info("Class: {} called me",value);
    }
}
