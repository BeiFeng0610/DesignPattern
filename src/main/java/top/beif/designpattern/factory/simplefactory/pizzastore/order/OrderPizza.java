package top.beif.designpattern.factory.simplefactory.pizzastore.order;

import top.beif.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 16116
 */
public class OrderPizza {

    public OrderPizza(){
        Pizza pizza = null;
        do {
            String orderType = getType();
            pizza = SimpleFactory.getPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.back();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
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
