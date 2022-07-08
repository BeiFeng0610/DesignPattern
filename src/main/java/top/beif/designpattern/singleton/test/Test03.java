package top.beif.designpattern.singleton.test;

/**
 * @author 16116
 */
public class Test03 {

}

class Singleton{
    private static Singleton singleton = null;
    private Singleton(){
        System.out.println("生成了一个实例");
    }
    // 懒汉式（非线程安全）
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}