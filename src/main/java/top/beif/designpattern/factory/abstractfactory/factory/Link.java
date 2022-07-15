package top.beif.designpattern.factory.abstractfactory.factory;

/**
 * @author 16116
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
