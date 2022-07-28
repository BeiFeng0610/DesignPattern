package top.beif.designpattern.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 16116
 */
class BigStringTest {

    @Test
    public void test(){
        String str = "012210";
        BigString bs = new BigString(str);
        bs.print();
    }
}