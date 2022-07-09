package top.beif.designpattern.factory.factorymethod.pizzastore.order;

import top.beif.designpattern.factory.factorymethod.pizzastore.pizza.*;

/**
 * @author 16116
 */
public class ShOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String orderType) {
        if ("greek".equals(orderType)) {
            return new ShGreekPizza();
        } else if ("cheese".equals(orderType)) {
            return new ShCheesePizza();
        }
        return null;
    }
}
