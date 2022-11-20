package org.example;


public class Main {
    public static void main(String[] args) {
        Queue queue = Queue.INSTANCE;

        HealCommand healCommand = new HealCommand(Priority.NORMAL, 2, "Adem", 100);
        HealCommand healCommand2 = new HealCommand(Priority.HIGH, "Ethan", 50);
        queue.addCommand(healCommand);
        queue.addCommand(healCommand2);

        queue.execute();
        queue.execute();
    }
}