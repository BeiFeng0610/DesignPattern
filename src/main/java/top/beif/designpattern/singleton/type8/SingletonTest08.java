package top.beif.designpattern.singleton.type8;

/**
 * @author 16116
 * 枚举
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadTest());
        thread.start();
        System.out.println(Singleton.INSTANCE.hashCode());
        Singleton.INSTANCE.sayOK();
    }
}

enum Singleton{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok");
    }
}

class ThreadTest implements Runnable {
    @Override
    public void run() {
        System.out.println(Singleton.INSTANCE.hashCode());
    }
}
