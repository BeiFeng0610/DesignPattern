package top.beif.designpattern.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 16116
 */
public class HTMLBuilder extends Builder {
    private String filename;
    private PrintWriter writer;

    @Override
    protected void bulidTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter("src/main/java/top/beif/designpattern/builder/" + filename));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        writer.println("<html><head><meta charset=\"UTF-8\"><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    protected void bulidString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    protected void bulidItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    protected void buildDone() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult(){
        return filename;
    }
}
