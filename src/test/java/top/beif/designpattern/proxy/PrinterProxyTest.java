package top.beif.designpattern.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 16116
 */
class PrinterProxyTest {

    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println(p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println(p.getPrinterName());
        p.print("hello, world.");
    }

}