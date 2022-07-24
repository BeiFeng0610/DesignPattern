package top.beif.designpattern.observer;

/**
 * Observer角色负责接收来自Subject角色的状态变化的通知。为此， 它声明了update方法。
 * @author 16116
 */
public interface Observer {
    void update(NumberGenerator generator);
}
