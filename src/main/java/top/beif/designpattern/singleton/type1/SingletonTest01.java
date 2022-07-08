package top.beif.designpattern.singleton.type1;

/**
 * @author 16116
 * 饿汉式（静态变量）
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}

class Singleton {
    private final static Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() {
        return INSTANCE;
    }
}


