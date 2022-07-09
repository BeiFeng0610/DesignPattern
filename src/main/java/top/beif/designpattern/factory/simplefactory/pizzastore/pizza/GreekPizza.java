package top.beif.designpattern.factory.simplefactory.pizzastore.pizza;

/**
 * @author 16116
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("为希腊披萨准备原材料");
    }
}
