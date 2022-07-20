package top.beif.designpattern.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 16116
 */
public class MultiStringDisplay extends Display {
    private List<String> list = new ArrayList<>();
    private int columns = 0;

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return list.size();
    }

    @Override
    public String getRowText(int row) {
        return list.get(row);
    }

    public void add(String string) {
        list.add(string);
        updateColumn(string);
    }

    private void updateColumn(String msg) {
        if (msg.getBytes().length > columns) {
            columns = msg.getBytes().length;
        }
        for (int i = 0; i < list.size(); i++) {
            int fills = columns - list.get(i).getBytes().length;
            if (fills > 0) {
                list.set(i, list.get(i) + spaces(fills));
            }
        }
    }

    private String spaces(int fills) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ".repeat(Math.max(0, fills)));
        return sb.toString();
    }
}
