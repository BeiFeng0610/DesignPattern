package top.beif.designpattern.factory.factorymethod.pizzastore.order;

import top.beif.designpattern.factory.factorymethod.pizzastore.pizza.BjCheesePizza;
import top.beif.designpattern.factory.factorymethod.pizzastore.pizza.BjGreekPizza;
import top.beif.designpattern.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author 16116
 */
public class BjOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String orderType) {
        if ("greek".equals(orderType)) {
            return new BjGreekPizza();
        } else if ("cheese".equals(orderType)) {
            return new BjCheesePizza();
        }
        return null;
    }
}
