package top.beif.designpattern.interpreter;

/**
 * @author 16116
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
