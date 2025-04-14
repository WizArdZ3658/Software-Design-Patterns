package org.example.executers;

public interface CommandExecuter {

    public boolean isApplicable(String command);

    public void runCommand();

}
