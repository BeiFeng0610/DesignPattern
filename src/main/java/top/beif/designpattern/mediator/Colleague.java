package top.beif.designpattern.mediator;

/**
 * Colleague角色负责定义与Mediator角色进行通信的接口(API)。
 * @author 16116
 */
public interface Colleague {
    void setMediator(Mediator mediator);

    void setColleagueEnabled(boolean enabled);
}
