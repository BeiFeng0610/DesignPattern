package top.beif.designpattern.singleton.type5;

/**
 * @author 16116
 * 懒汉式（线程安全，同步代码块）
 */
public class SingletonTest05 {
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
        synchronized (Singleton.class) {
            if (INSTANCE == null) {
                INSTANCE = new Singleton();
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

