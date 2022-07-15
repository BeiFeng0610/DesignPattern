package top.beif.designpattern.factory.abstractfactory.factory;

/**
 * @author 16116
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
