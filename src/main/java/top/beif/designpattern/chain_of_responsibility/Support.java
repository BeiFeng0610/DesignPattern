package top.beif.designpattern.chain_of_responsibility;

/**
 * Handler 角色定义了处理请求的接口(APT)。Handler角色知道”下一个处理者” 是谁，如果自
 * 已无法处理请求，它会将请求转给“下一个处理者”。当然，“下一个处理者” 也是Handler角色。
 * 在示例程序中，由Support类扮演此角色。负责处理请求的是support方法。
 * @author 16116
 */
public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        for (Support obj = this; true; obj = obj.next) {
            if (obj.resolve(trouble)) {
                obj.done(trouble);
                break;
            } else if (obj.next == null) {
                obj.fail(trouble);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "[" + name + ']';
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
