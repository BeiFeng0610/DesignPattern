package top.beif.designpattern.adapter.type1;

/**
 * @author 16116
 */
public class PrintBanner extends Banner
        implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
