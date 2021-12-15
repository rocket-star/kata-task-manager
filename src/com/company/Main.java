package com.company;

import com.company.parser_utils.IHM;
import com.company.parser_utils.InputParse;
import com.company.parser_utils.TaskService;

import static java.lang.System.exit;

public class Main {


    public static void main(String[] args) {

        System.out.println("No Task yet");

        TaskService taskService = new TaskService();

        IHM ihm = new IHM();

        String userInput = "";

        while(true) {
            System.out.print(">>> ");
            userInput = ihm.read();

            if(userInput.equals("q")){
                System.out.println("Bye!");
                exit(1);
                break;
            }

            InputParse.parse(userInput, taskService);
            ihm.write(taskService.toString());
        }
    }
}
