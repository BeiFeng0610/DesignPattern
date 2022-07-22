package top.beif.designpattern.facade.pagemaker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 16116
 */
class PageMakerTest {

    @Test
    public void test(){
        PageMaker.makeWelcomePage("mamoru@hyuki.com", "welcome.html");
    }

    @Test
    public void test2(){
        PageMaker.makeLinkPage("LinkPage.html");
    }


}