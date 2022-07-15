package top.beif.designpattern.factory.abstractfactory.tablefactory;

import top.beif.designpattern.factory.abstractfactory.factory.Link;

/**
 * @author 16116
 */
public class TableLink extends Link {

    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "    <td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
