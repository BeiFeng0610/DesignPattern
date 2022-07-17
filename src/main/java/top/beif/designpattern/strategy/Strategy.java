package top.beif.designpattern.strategy;

/**
 * @author 16116
 */
public interface Strategy {
    Hand nextHand();

    void study(boolean win);
}
