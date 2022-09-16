package com.openbank.di.demo.printer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component("NON_FOO")
@Slf4j
public class NonFooPrinter implements Printer{
    private PrinterTypes name = PrinterTypes.NON_FOO;
    @Override
    public void printSomething(final String value) {
        log.info("NON_FOO Class: {} called me",value);
    }
}
