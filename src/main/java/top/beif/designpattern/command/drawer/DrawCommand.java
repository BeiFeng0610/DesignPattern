package top.beif.designpattern.command.drawer;

import top.beif.designpattern.command.command.Command;

import java.awt.*;

/**
 * ConcreteCommand角色负责实现在Command角色中定义的接口(API)。
 * @author 16116
 */
public class DrawCommand implements Command {
    protected Drawable drawable;
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
