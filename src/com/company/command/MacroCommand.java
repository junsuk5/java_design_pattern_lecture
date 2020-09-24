package com.company.command;

import java.util.Stack;

public class MacroCommand implements Command {
    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }

    public void add(Command command) {
        commands.push(command);
    }

    public void undo() {
        commands.pop();
        execute();
    }
}
