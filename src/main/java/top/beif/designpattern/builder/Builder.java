package top.beif.designpattern.builder;

/**
 * @author 16116
 */
public abstract class Builder {
    private boolean initialized = false;

    public void makeTitle(String title) {
        if (!initialized) {
            bulidTitle(title);
            initialized = true;
        }
    }

    public void makeString(String str) {
        if (initialized) {
            bulidString(str);
        }
    }

    public void makeItems(String[] items) {
        if (initialized) {
            bulidItems(items);
        }
    }

    public void close(){
        if (initialized) {
            buildDone();
        }
    }

    protected abstract void bulidTitle(String title);

    protected abstract void bulidString(String str);

    protected abstract void bulidItems(String[] items);

    protected abstract void buildDone();
}
