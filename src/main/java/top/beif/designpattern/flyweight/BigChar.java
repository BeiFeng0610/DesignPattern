package top.beif.designpattern.flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 按照通常方式编写程序会导致程序变重，所以如集能够共享实例会比较好。
 * 而Flyweight角色表示的就是那些实例会被共享的类。
 * @author 16116
 */
public class BigChar {
    private char charName;
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("big" + charName + ".txt")
            );
            String line;
            StringBuilder buf = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                buf.append(line).append("\n");
            }
            reader.close();
            this.fontData = buf.toString();
        } catch (IOException e) {
            this.fontData = charName + "?";
        }
    }

    public void print(){
        System.out.println(fontData);
    }
}
