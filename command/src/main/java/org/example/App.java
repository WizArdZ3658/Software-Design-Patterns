package org.example;

import org.example.executers.ACommandExecuter;
import org.example.executers.BCommandExecuter;
import org.example.executers.CommandExecuter;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<CommandExecuter> executerList = new ArrayList<>();
        executerList.add(new ACommandExecuter());
        executerList.add(new BCommandExecuter());

        for (CommandExecuter executer : executerList) {
            if (executer.isApplicable("B")) {
                executer.runCommand();
            } else {
                System.out.println("Command not found");
            }
        }
    }
}
