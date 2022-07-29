package top.beif.designpattern.command.command;

import java.util.*;

/**
 * ConcreteCommand角色负责实现在Command角色中定义的接口(API)。
 * @author 16116
 */
public class MacroCommand implements Command {

    private Deque<Command> commands = new LinkedList<>();

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void append(Command cmd) {
        if (cmd != this) {
            commands.addLast(cmd);
        }
    }

    public void undo() {
        if (!commands.isEmpty()) {
            commands.removeLast();
        }
    }

    public void clear() {
        commands.clear();
    }
}
