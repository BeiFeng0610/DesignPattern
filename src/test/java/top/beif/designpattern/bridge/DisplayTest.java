package top.beif.designpattern.bridge;

import org.junit.jupiter.api.Test;
import top.beif.designpattern.bridge.impl.CharDisplayImpl;
import top.beif.designpattern.bridge.impl.StringDisplayImpl;
import top.beif.designpattern.bridge.impl.TextFileDisplayImpl;

/**
 * @author 16116
 */
class DisplayTest {

    @Test
    public void test(){
        Display d1 = new Display(new StringDisplayImpl("hello,China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("hello,world."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello,Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(3);
        Display d4 = new Display(new TextFileDisplayImpl("test.txt"));
        d4.display();
    }

    @Test
    public void test2(){
        IncreaseDisplay d1 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay d2 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
        IncreaseDisplay d3 = new IncreaseDisplay(new StringDisplayImpl("hello!"), 1);

        d1.increaseDisplay(4);
        d2.increaseDisplay(6);
        d3.increaseDisplay(4);
    }

    @Test
    public void test3(){
        RandomDisplay d1 = new RandomDisplay(new StringDisplayImpl("hello!"));
        d1.randomDisplay(10);
    }

}