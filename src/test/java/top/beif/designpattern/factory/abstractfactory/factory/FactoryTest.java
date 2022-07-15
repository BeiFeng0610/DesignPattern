package top.beif.designpattern.factory.abstractfactory.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 16116
 */
class FactoryTest {

    @Test
    public void test(){
        Factory factory = Factory.getFactory("top.beif.designpattern.factory.abstractfactory.tablefactory.TableFactory");

        Link people = factory.createLink("人民日报", "http://www.people.com.cn");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn");

        Link usYahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
        Link jpYahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp");
        Link excite = factory.createLink("Excite!", "http://www.excite.com");
        Link google = factory.createLink("google!", "http://www.google.com");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(usYahoo);
        trayYahoo.add(jpYahoo);

        Tray traySearch = factory.createTray("检索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "北风");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}