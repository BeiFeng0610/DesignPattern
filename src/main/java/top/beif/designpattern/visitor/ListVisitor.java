package top.beif.designpattern.visitor;

import java.util.Iterator;

/**
 * ConcreteVisitor 角色负责实现 Visitor 角色所定义的接口(API)。它要实现所有的visit(XXX)方法，
 * 即实现如何处理每个 ConcreteElement 角色。
 * 如同在 ListVisitor 中，currentDir 字段的值不断发生变化一样，
 * 随着visit(XXX)处理的进行，ConcreteVisitor 角色的内部状态也会不断地发生变化。
 * @author 16116
 */
public class ListVisitor extends Visitor {
    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
