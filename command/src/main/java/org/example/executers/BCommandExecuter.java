package org.example.executers;

public class BCommandExecuter implements CommandExecuter{
    private static String commandName = "B";

    @Override
    public boolean isApplicable(String command) {
        return commandName.equals(command);
    }

    @Override
    public void runCommand() {
        System.out.println("B command is being run");
    }
}
