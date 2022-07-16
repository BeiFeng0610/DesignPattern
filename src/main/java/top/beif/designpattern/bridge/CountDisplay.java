package top.beif.designpattern.bridge;

import top.beif.designpattern.bridge.impl.DisplayImpl;

/**
 * @author 16116
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
