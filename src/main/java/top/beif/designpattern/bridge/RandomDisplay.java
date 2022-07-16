package top.beif.designpattern.bridge;

import top.beif.designpattern.bridge.impl.DisplayImpl;

import java.util.Random;

/**
 * @author 16116
 */
public class RandomDisplay extends CountDisplay {

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        Random random = new Random();
        multiDisplay(random.nextInt(times));
    }

}
