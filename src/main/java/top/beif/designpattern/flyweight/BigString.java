package top.beif.designpattern.flyweight;

/**
 * Client角色使用FlyweightFactory角色来生成Flyweight角色。
 * @author 16116
 */
public class BigString {
    private BigChar[] bigChars;

    public BigString(String str) {
        bigChars = new BigChar[str.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(str.charAt(i));
        }
    }

    public void print(){
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }

}
