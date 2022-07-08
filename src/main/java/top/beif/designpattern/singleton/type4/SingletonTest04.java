package top.beif.designpattern.singleton.type4;

/**
 * @author 16116
 * 懒汉式（线程安全）
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadTest());
        thread.start();
        System.out.println(Singleton.getInstance().hashCode());
    }
}

class Singleton {
    private static Singleton INSTANCE;

    private Singleton(){}

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}

class ThreadTest implements Runnable {
    @Override
    public void run() {
        System.out.println(Singleton.getInstance().hashCode());
    }
}

