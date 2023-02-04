package top.beif.designpattern.factory.factorymethod.idcard;

import org.junit.jupiter.api.Test;
import top.beif.designpattern.factory.factorymethod.framework.Factory;
import top.beif.designpattern.factory.factorymethod.framework.Product;

import java.util.Collection;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 16116
 */
class IDCardFactoryTest {

    @Test
    public void Test1(){
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("张三");
        Product card2 = factory.create("罗老师");
        card1.use();
        card2.use();

        Map<Integer, String> idCards = ((IDCardFactory) factory).getIDCards();
        Collection<String> values = idCards.values();
        System.out.println("values = " + values);
        System.out.println("idCards = " + idCards);
    }

}