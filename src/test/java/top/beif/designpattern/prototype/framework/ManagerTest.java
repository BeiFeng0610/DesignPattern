package top.beif.designpattern.prototype.framework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import top.beif.designpattern.prototype.MessageBox;
import top.beif.designpattern.prototype.UnderlinePen;


/**
 * @author 16116
 */
class ManagerTest {

    @Test
    public void test(){
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("upen", upen);
        manager.register("mbox", mbox);
        manager.register("sbox", sbox);

        Product p1 = manager.create("upen");
        Assertions.assertNotNull(p1,"实例不存在！");
        p1.use("hello");

        Product p2 = manager.create("mbox");
        Assertions.assertNotNull(p2,"实例不存在！");
        p2.use("hello, world!");

        Product p3 = manager.create("sbox");
        Assertions.assertNotNull(p3,"实例不存在！");
        p3.use("hello, world!");

    }
}