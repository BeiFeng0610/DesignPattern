package top.beif.designpattern.factory.factorymethod.pizzastore.order;

import top.beif.designpattern.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 16116
 */
public abstract class OrderPizza {
    public abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            if (pizza == null) {
                System.out.println("没有指定商品！");
                break;
            }
            pizza.prepare();
            pizza.back();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("input pizza type：");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
