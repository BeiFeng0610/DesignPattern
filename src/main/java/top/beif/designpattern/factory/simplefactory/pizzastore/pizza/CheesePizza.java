package top.beif.designpattern.factory.simplefactory.pizzastore.pizza;

/**
 * @author 16116
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("为芝士披萨准备原材料");
    }
}
