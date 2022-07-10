package top.beif.designpattern.factory.factorymethod.phone;

import top.beif.designpattern.factory.factorymethod.framework.Product;

/**
 * @author 16116
 */
public class XMphone extends Product {

    private String model;

    XMphone(String model) {
        System.out.println("生产了 " + model);
        this.model = model;
    }

    @Override
    public void use() {
        System.out.println("使用了 " + model);
    }

    public String getModel() {
        return model;
    }
}
