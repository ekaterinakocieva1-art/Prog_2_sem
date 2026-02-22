//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Commands.Info;
import Commands.Update;
import Managers.CollectionManager;
import Managers.CommandInvoker;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CommandInvoker commandInvoker = new CommandInvoker();
        CollectionManager collectionManager = new CollectionManager();
        commandInvoker.register(new Info());
        commandInvoker.register(new Update(collectionManager, scanner));
        while(true){
            String commandName = scanner.nextLine();
            System.out.println(commandName);
            //commandInvoker.execute(commandName);
            if (commandName.equals("update")){
                String id = scanner.next();
                commandInvoker.execute(commandName, id);
            } else if (commandName.equals("info")) {
                commandInvoker.execute(commandName);
            }

        }
    }
}
