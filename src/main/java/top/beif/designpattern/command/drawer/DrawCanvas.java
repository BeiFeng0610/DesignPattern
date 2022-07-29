package top.beif.designpattern.command.drawer;

import top.beif.designpattern.command.command.MacroCommand;

import java.awt.*;
import java.util.Random;

/**
 * Receiver角色是Command角色执行命令时的对象， 也可以称其为命令接收者。
 * @author 16116
 */
public class DrawCanvas extends Canvas implements Drawable {

    private Color color = Color.red;
    private int radius = 6;
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    @Override
    public void print(Graphics graphics) {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillRect(x - radius, y - radius, radius * 2, radius * 2);
    }
}
