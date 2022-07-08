package top.beif.designpattern.singleton.type3;

/**
 * @author 16116
 * 懒汉式（线程不安全）
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadTest());
        thread.start();
        System.out.println(Singleton.getInstance().hashCode());
    }
}

class Singleton {
    private static Singleton INSTANCE;

    private Singleton(){}

    public static Singleton getInstance() {
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

