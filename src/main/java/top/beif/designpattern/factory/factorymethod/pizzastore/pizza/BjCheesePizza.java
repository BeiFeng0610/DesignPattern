package top.beif.designpattern.factory.factorymethod.pizzastore.pizza;

/**
 * @author 16116
 */
public class BjCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京味的芝士披萨");
        System.out.println("为北京味的芝士披萨准备原材料");
    }
}
