package top.beif.designpattern.singleton.type7;

/**
 * @author 16116
 * 静态内部类
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadTest());
        thread.start();
        System.out.println(Singleton.getInstance().hashCode());
    }
}

class Singleton {
    private Singleton(){}

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}

class ThreadTest implements Runnable {
    @Override
    public void run() {
        System.out.println(Singleton.getInstance().hashCode());
    }
}

