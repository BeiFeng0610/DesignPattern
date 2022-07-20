package top.beif.designpattern.visitor;


/**
 * Visitor 角色负责对数据结构中每个具体的元素(ConcreteElement角色）声明一个用于访问
 * XXX 的 visit(XXX) 方法。visit(XXX) 是用于处理 xxx 的方法， 负责实现该方法的是 ConcreteVisitor 角色
 * @author 16116
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);

}
