package top.beif.designpattern.proxy;

/**
 * Proxy角色会尽扯处理来自Client角色的请求。
 * 只有当自己不能处理时， 它才会将工作交给ReaSubject角色。
 * Proxy角色只有在必要时才会生成ReaSubject角色。
 * Proxy角色实现了在Subject角色中定义的接口(API)。
 * @author 16116
 */
public class PrinterProxy implements Printable {
    private String name;
    private Printer real;

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String str) {
        realize();
        real.print(str);
    }

    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}
