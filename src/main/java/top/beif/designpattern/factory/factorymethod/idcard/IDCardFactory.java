package top.beif.designpattern.factory.factorymethod.idcard;

import top.beif.designpattern.factory.factorymethod.framework.Factory;
import top.beif.designpattern.factory.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 16116
 */
public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();
    private Map<Integer, String> idCards = new HashMap<>();
    private static int cid = 0;

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, ++cid);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        owners.add(idCard.getOwner());
        idCards.put(idCard.getCid(), idCard.getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }

    public Map<Integer, String> getIDCards() {
        return idCards;
    }
}
