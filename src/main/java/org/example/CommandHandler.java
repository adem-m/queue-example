package org.example;

public interface CommandHandler<C extends Command> {
    void handle(C command);
}

