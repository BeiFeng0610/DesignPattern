package top.beif.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject角色表示观察对象。Subject角色定义了注册观察者和删除观察者的方法。
 * 此外， 它还声明了”获取现在的状态” 的方法.
 * @author 16116
 */
public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();

}
