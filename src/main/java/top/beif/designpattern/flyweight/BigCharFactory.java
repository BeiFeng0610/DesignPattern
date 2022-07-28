package top.beif.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyweightFactory角色是生成Flyweight角色的工厂。在工厂中生成Flyweight角色可以实现共享实例
 * @author 16116
 */
public class BigCharFactory {
    private Map<String, BigChar> pool = new HashMap<>();
    private static final BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory(){}

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charName){
        BigChar bc = pool.get("" + charName);
        if (bc == null) {
            bc = new BigChar(charName);
            pool.put("" + charName, bc);
        }
        return bc;
    }
}
