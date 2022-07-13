package top.beif.designpattern.prototype;

import top.beif.designpattern.prototype.framework.Product;

/**
 * @author 16116
 */
public class UnderlinePen extends Product {

    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int len = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < len; i++) {
            System.out.print(ulchar);
        }
        System.out.println(" ");
    }

}
