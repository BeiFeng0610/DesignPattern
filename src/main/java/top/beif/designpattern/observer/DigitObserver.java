package top.beif.designpattern.observer;

/**
 * ConcreteObserver角色表示具体的Observer。
 * 当它的update方法被调用后， 会去获取要观察的对象的最新状态。
 * @author 16116
 */
public class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver: " + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
