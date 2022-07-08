package top.beif.designpattern.singleton.type6;

/**
 * @author 16116
 * 双重检锁
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadTest());
        thread.start();
        System.out.println(Singleton.getInstance().hashCode());
    }
}

class Singleton {
    private static volatile Singleton INSTANCE;

    private Singleton(){}

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
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

