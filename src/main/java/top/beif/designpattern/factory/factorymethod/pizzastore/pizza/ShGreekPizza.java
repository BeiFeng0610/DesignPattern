package top.beif.designpattern.factory.factorymethod.pizzastore.pizza;

/**
 * @author 16116
 */
public class ShGreekPizza extends Pizza {

    @Override
    public void prepare() {
        setName("上海味的希腊披萨");
        System.out.println("为上海味的希腊披萨准备原材料");
    }
}
