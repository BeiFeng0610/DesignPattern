package top.beif.designpattern.Iterator;

/**
 * @author 16116
 */
public interface Iterator {
    /**
     * 判断是否还有下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 返回元素，然后指针后移
     * @return
     */
    Object next();
}
