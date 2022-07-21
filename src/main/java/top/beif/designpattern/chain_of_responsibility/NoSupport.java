package top.beif.designpattern.chain_of_responsibility;

/**
 * ConcreteVisitor 角色是处理请求的具体角色。在示例程序中，由NoSupport、LimitSupport、
 * OddSupport、SpecialSupport等各个类扮演此角色。
 * @author 16116
 */
public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
