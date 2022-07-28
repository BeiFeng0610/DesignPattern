package top.beif.designpattern.proxy;

/**
 * Subject角色定义了使Proxy角色和RealSubject角色之间具有一致性的接口。
 * 由于存在Subject角色， 所以Client角色不必在意它所使用的究竟是Proxy角色还是RealSubject角色。
 * @author 16116
 */
public interface Printable {
    void setPrinterName(String name);
    String getPrinterName();
    void print(String str);
}
