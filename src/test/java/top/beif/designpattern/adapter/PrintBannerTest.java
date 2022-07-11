package top.beif.designpattern.adapter;

import org.junit.jupiter.api.Test;
import top.beif.designpattern.adapter.type1.Print;
import top.beif.designpattern.adapter.type1.PrintBanner;


/**
 * @author 16116
 */
class PrintBannerTest {

    @Test
    public void TestAdapter(){
        Print print = new PrintBanner("hello");
        print.printWeak();
        print.printStrong();
    }

}