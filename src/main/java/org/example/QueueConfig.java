package org.example;

import java.util.Map;

public class QueueConfig {
    public Map<Class<? extends Command>, CommandHandler> commandCommandHandlerMap = Map.of(
            HealCommand.class, new HealCommandHandler()
    );
}
