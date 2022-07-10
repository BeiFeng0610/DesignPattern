package top.beif.designpattern.Iterator;

/**
 * @author 16116
 */
public interface Aggregate {

    /**
     * 让实现类，生成对应的迭代器，并调用自成
     * @return
     */
    Iterator iterator();

}
