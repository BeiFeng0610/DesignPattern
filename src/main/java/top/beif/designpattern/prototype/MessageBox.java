package top.beif.designpattern.prototype;

import top.beif.designpattern.prototype.framework.Product;

/**
 * @author 16116
 */
public class MessageBox extends Product {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }
    @Override
    public void use(String s) {
        int len = s.getBytes().length;
        for (int i = 0; i < len + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < len + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }
}
