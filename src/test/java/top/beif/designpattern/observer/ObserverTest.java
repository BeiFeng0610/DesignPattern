package top.beif.designpattern.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 16116
 */
class ObserverTest {

    @Test
    public void test(){
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();

    }

    @Test
    public void test02(){
        NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 5);
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();

    }


}