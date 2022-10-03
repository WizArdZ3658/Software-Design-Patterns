package org.example.executers;

public class ACommandExecuter implements CommandExecuter{

    private static String commandName = "A";

    @Override
    public boolean isApplicable(String command) {
        return commandName.equals(command);
    }

    @Override
    public void runCommand() {
        System.out.println("A command is being run");
    }
}
