package top.beif.designpattern.factory.abstractfactory.listfactory;

import top.beif.designpattern.factory.abstractfactory.factory.Item;
import top.beif.designpattern.factory.abstractfactory.factory.Tray;

import java.util.Iterator;

/**
 * @author 16116
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<li>\n")
                .append(caption).append("\n")
                .append("<ul>\n");
        for (Item next : tray) {
            builder.append(next.makeHTML());
        }
        builder.append("</ul>\n")
                .append("</li>\n");
        return builder.toString();
    }
}
