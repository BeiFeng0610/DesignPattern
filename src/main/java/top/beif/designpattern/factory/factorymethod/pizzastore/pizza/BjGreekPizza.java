package top.beif.designpattern.factory.factorymethod.pizzastore.pizza;

/**
 * @author 16116
 */
public class BjGreekPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京味的希腊披萨");
        System.out.println("为北京味的希腊披萨准备原材料");
    }
}
