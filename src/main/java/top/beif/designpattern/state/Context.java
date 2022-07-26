package top.beif.designpattern.state;

/**
 * Context角色持有表示当前状态的ConcreteState角色。
 * 此外，它还定义了供外部调用者使用State模式的接口(API)。
 * @author 16116
 */
public interface Context {
    void setClock(int hour);
    void changeState(State state);
    void callSecurityCenter(String msg);
    void recordLog(String msg);
}
