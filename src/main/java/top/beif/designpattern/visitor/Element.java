package top.beif.designpattern.visitor;

/**
 * Element 角色表示 Visitor 角色的访问对象。它声明了接受访问者的 accept方法。
 * accept方法 接收到的参数是 Visitor 角色。
 * @author 16116
 */
public interface Element {
    void accept(Visitor v);
}
