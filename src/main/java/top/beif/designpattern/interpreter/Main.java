package top.beif.designpattern.interpreter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 16116
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader("program.txt"));
        String text;
        while ((text = reader.readLine()) != null) {
            System.out.println("text = \"" + text + "\"");
            Node node = new ProgramNode();
            node.parse(new Context(text));
            System.out.println("node = " + node);
        }
        reader.close();
    }
}
