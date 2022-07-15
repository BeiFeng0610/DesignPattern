package top.beif.designpattern.factory.abstractfactory.factory;

import java.util.ArrayList;

/**
 * @author 16116
 */
public abstract class Tray extends Item {
    protected ArrayList<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
