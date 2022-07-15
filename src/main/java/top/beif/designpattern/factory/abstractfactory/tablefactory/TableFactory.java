package top.beif.designpattern.factory.abstractfactory.tablefactory;

import top.beif.designpattern.factory.abstractfactory.factory.Factory;
import top.beif.designpattern.factory.abstractfactory.factory.Link;
import top.beif.designpattern.factory.abstractfactory.factory.Page;
import top.beif.designpattern.factory.abstractfactory.factory.Tray;

/**
 * @author 16116
 */
public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
