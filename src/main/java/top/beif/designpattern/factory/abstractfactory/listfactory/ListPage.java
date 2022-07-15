package top.beif.designpattern.factory.abstractfactory.listfactory;

import top.beif.designpattern.factory.abstractfactory.factory.Item;
import top.beif.designpattern.factory.abstractfactory.factory.Page;

import java.util.Iterator;

/**
 * @author 16116
 */
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><head><meta charset=\"UTF-8\"><title>").append(title).append("</title></head>\n")
                .append("<body>\n")
                .append("<h1>").append(title).append("</h1>\n")
                .append("<ul>\n");
        for (Item item : content) {
            builder.append(item.makeHTML());
        }
        builder.append("</ul>\n")
                .append("<hr><address>").append(author).append("</address")
                .append("</body></html>\n");

        return builder.toString();
    }
}
