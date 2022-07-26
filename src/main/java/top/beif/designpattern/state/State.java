package top.beif.designpattern.state;

/**
 * State角色表示状态， 定义了根据不同状态进行不同处理的接口(API)。
 * 该接口(API)是那些处理内容依赖千状态的方法的集合。
 * @author 16116
 */
public interface State {
    void doClock(Context context, int hour);
    void doUse(Context context);
    void doAlarm(Context context);
    void doPhone(Context context);
}
