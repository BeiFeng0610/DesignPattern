package top.beif.designpattern.proxy;

/**
 * “本人“ RealSubject角色会在“代理人“Proxy角色无法胜任工作时出场。
 * 它与Proxy角色一样，也实现了在Subject角色中定义的接口(API)。
 * @author 16116
 */
public class Printer implements Printable{
    private String name;
    public Printer() {
        heavyJob("正在生成 Printer 的实例");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("正在生成 Printer 的实例（" + name + "）");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String str) {
        System.out.println("=== " + name + " ===");
        System.out.println(str);
    }

    private void heavyJob(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(".");
        }
        System.out.println("结束。");
    }
}
