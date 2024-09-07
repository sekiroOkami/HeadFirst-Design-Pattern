package com.example;

import java.util.Stack;

public class RemoteControl {
    ICommand command;
    Stack<ICommand> commandHistory = new Stack<>();

    public ICommand getCommand() {
        return command;
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commandHistory.add(command);
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            ICommand lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }
}
