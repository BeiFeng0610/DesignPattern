package top.beif.designpattern.decorator;

/**
 * @author 16116
 */
public abstract class Border extends Display{
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
