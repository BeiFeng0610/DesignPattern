package top.beif.designpattern.factory.factorymethod.phone;

import top.beif.designpattern.factory.factorymethod.framework.Factory;
import top.beif.designpattern.factory.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 16116
 */
public class XMphoneFactory extends Factory {

    private List<String> list = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new XMphone(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        list.add(((XMphone) product).getModel());
    }

    public List<String> getList() {
        return list;
    }
}
