package org.example;

abstract public class Command {
    private final Priority priority;
    private int turnCount;
    private boolean isInfinite = false;

    protected Command(Priority priority) {
        this.priority = priority;
        this.turnCount = -1;
        this.isInfinite = true;
    }

    protected Command(Priority priority, int turnCount) {
        this.priority = priority;
        this.turnCount = turnCount;
    }

    public int getTurnCount() {
        return turnCount;
    }

    public void decrementTurnCount() {
        turnCount--;
    }

    public Priority getPriority() {
        return priority;
    }

    public boolean isInfinite() {
        return isInfinite;
    }
}
