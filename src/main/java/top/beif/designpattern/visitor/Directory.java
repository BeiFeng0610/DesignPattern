package top.beif.designpattern.visitor;

import top.beif.designpattern.composite.FileTreatMeantException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ConcreteElement 角色负责实现 Element角色所定义的接口(API)。
 * 在示例程序中，由File类和Directory类扮演此角色。
 * @author 16116
 */
public class Directory extends Entry {
    private String name;
    private List<Entry> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        SizeVisitor sv = new SizeVisitor();
        accept(sv);
        return sv.getSize();
    }

    @Override
    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    /**
     * ObjectStructure 角色负责处理 Element角色的集合。ConcreteVisitor角色为每个Element角色都准备了处理方法。
     * 在示例程序中， 由 Directory类扮演此角色（一人分饰两角）。
     * 为了让 ConcreteVisitor角色 可以遍历处理每个Element角色，
     * 在示例程序中， 我们在Directory类中实现了Iterator 方法。
     */
    @Override
    public Iterator<Entry> iterator() throws FileTreatMeantException {
        return dir.iterator();
    }
}
