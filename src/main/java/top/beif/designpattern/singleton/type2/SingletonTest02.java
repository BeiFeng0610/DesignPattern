package top.beif.designpattern.singleton.type2;

/**
 * @author 16116
 * 饿汉式（静态代码块）
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}

class Singleton {
    private static final Singleton INSTANCE;

    static {
        INSTANCE = new Singleton();
    }

    private Singleton(){}

    public static Singleton getInstance() {
        return INSTANCE;
    }
}


