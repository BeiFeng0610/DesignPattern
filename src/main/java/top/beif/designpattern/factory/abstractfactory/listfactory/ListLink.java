package top.beif.designpattern.factory.abstractfactory.listfactory;

import top.beif.designpattern.factory.abstractfactory.factory.Link;

/**
 * @author 16116
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "    <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
