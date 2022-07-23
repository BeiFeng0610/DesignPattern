package top.beif.designpattern.mediator;

/**
 * Mediator角色负责定义与Colleague角色进行通信和做出决定的接口(API)
 * @author 16116
 */
public interface Mediator {
    void createColleagues();

    void colleagueChanged();
}
