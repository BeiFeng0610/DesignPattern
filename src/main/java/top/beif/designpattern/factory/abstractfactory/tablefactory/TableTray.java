package top.beif.designpattern.factory.abstractfactory.tablefactory;

import top.beif.designpattern.factory.abstractfactory.factory.Item;
import top.beif.designpattern.factory.abstractfactory.factory.Tray;

/**
 * @author 16116
 */
public class TableTray extends Tray {

    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<td>")
                .append("<table width=\"100%\" border=\"1\"><tr>")
                .append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"").append(tray.size()).append("\"><b>").append(caption).append("</b></td")
                .append("</tr>\n")
                .append("<tr>\n");
        for (Item item : tray) {
            builder.append(item.makeHTML());
        }
        builder.append("</tr></table>")
                .append("</td>");

        return builder.toString();
    }
}
