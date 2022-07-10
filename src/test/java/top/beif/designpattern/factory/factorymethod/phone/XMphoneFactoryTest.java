package top.beif.designpattern.factory.factorymethod.phone;

import org.junit.jupiter.api.Test;
import top.beif.designpattern.factory.factorymethod.framework.Factory;
import top.beif.designpattern.factory.factorymethod.framework.Product;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 16116
 */
class XMphoneFactoryTest {

    @Test
    public void Test1(){
        Factory factory = new XMphoneFactory();
        Product phone1 = factory.create("小米12");
        Product phone2 = factory.create("红米K30SU");
        phone1.use();
        phone2.use();
    }

}