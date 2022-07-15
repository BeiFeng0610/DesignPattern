package top.beif.designpattern.factory.abstractfactory.tablefactory;

import top.beif.designpattern.factory.abstractfactory.factory.Item;
import top.beif.designpattern.factory.abstractfactory.factory.Page;

/**
 * @author 16116
 */
public class TablePage extends Page {

    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><head><meta charset=\"UTF-8\"><title>").append(title).append("</title></head>\n")
                .append("<body>\n")
                .append("<h1>").append(title).append("</h1>\n")
                .append("<table width=\"80%\" border=\"3\">\n ");
        for (Item item : content) {
            builder.append("<tr>").append(item.makeHTML()).append("</tr>");
        }
        builder.append("</table>\n")
                .append("<hr><address>").append(author).append("</address>")
                .append("</body></html>\n");
        return builder.toString();
    }
}
