package top.beif.designpattern.factory.simplefactory.pizzastore.order;

import top.beif.designpattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import top.beif.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @author 16116
 */
public class SimpleFactory {

    public static Pizza getPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("简单工厂");
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("芝士披萨");
        }
        return pizza;
    }

}
