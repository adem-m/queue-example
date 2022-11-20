package org.example;

public class HealCommand extends Command {
    private final String target;
    private final int amount;

    protected HealCommand(Priority priority, String target, int amount) {
        super(priority);
        this.target = target;
        this.amount = amount;
    }

    protected HealCommand(Priority priority, int turnCount, String target, int amount) {
        super(priority, turnCount);
        this.target = target;
        this.amount = amount;
    }

    public String getTarget() {
        return target;
    }

    public int getAmount() {
        return amount;
    }
}
