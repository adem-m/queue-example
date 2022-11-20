package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Queue {
    private final List<Command> commands;
    private final QueueConfig queueConfig;
    public static Queue INSTANCE = new Queue(new QueueConfig());

    private Queue(QueueConfig queueConfig) {
        this.queueConfig = queueConfig;
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void execute() {
        if (commands.isEmpty()) {
            System.out.println("Queue is empty !");
            return;
        }
        sortCommandsByPriority();
        commands.forEach(command -> {
            CommandHandler commandHandler = queueConfig.commandCommandHandlerMap.get(command.getClass());
            commandHandler.handle(command);
            if (!command.isInfinite()) command.decrementTurnCount();
        });
        clearCommands();
    }

    private void sortCommandsByPriority() {
        commands.sort(Comparator.comparingInt(o -> o.getPriority().ordinal()));
    }

    private void clearCommands() {
        commands.removeIf(command -> command.getTurnCount() == 0);
    }
}
