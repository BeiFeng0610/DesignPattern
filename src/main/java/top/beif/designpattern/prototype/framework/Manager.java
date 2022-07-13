package top.beif.designpattern.prototype.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 16116
 */
public class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = showcase.get(protoName);
        if (p != null) {
            return p.createClone();
        }
        return null;
    }

}
