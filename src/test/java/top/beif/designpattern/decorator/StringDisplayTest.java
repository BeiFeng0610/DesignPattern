package top.beif.designpattern.decorator;

import org.junit.jupiter.api.Test;

import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 16116
 */
class StringDisplayTest {

    @Test
    public void test(){
        Display b1 = new StringDisplay("Hello,world");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();

        Display b4 =
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new StringDisplay("Hello,world!")
                                                ), '*'
                                        )
                                )
                        ), '/'
                );
        b4.show();

    }

    @Test
    public void test2(){
        Display b1 = new StringDisplay("Hello,world");
        UpDownBorder b2 = new UpDownBorder(b1, '#');
        b2.show();

        Display b3 = new FullBorder(
                new SideBorder(b2, '/')
        );
        b3.show();

    }
    @Test
    public void test3(){
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("hello,world");
        md.add("hello,worldafsdfsd");
        md.add("hello,world");
        md.show();

        Display d1 = new SideBorder(md, '#');
        d1.show();

        Display d2 = new FullBorder(md);
        d2.show();

    }

}