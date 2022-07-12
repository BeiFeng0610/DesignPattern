package top.beif.designpattern.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 16116
 */
class AbstractDisplayTest {

    @Test
    public void Test(){

        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("hello,world!");
        AbstractDisplay d3 = new StringDisplay("你好,世界!");
        d1.display();
        d2.display();
        d3.display();
    }
}