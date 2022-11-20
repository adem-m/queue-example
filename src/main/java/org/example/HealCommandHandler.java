package org.example;

public class HealCommandHandler implements CommandHandler<HealCommand> {

    @Override
    public void handle(HealCommand command) {
        System.out.printf("Healed %s of %d HP%n", command.getTarget(), command.getAmount());
    }
}
