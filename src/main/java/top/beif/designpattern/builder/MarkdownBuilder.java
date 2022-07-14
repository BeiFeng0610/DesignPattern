package top.beif.designpattern.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 16116
 */
public class MarkdownBuilder extends Builder {
    private String filename;
    private PrintWriter writer;

    @Override
    protected void bulidTitle(String title) {
        filename = title + ".md";
        try {
            writer = new PrintWriter(new FileWriter("src/main/java/top/beif/designpattern/builder/" + filename));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        writer.println("# " + title);
        writer.println("\n");
    }

    @Override
    protected void bulidString(String str) {
        writer.println(str);
        writer.println("\n");
    }

    @Override
    protected void bulidItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            writer.println("- " + items[i]);
            writer.println("\n");
        }
        writer.println("\n");
    }

    @Override
    protected void buildDone() {
        writer.close();
    }

    public String getResult(){
        return filename;
    }
}
