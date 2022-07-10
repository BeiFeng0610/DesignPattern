package top.beif.designpattern.factory.factorymethod.framework;

import java.util.List;

/**
 * @author 16116
 */
public abstract class Factory {


    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);

}
