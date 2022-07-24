package top.beif.designpattern.observer;

import java.util.Random;

/**
 * ConcreteSubject角色表示具体的被观察对象。
 * 当自身状态发生变化后， 它会通知所有已经注册的Observer角色。
 * @author 16116
 */
public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
