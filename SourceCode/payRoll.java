package SourceCode;

import SourceCode.feature.getData;
import SourceCode.feature.insert;
import SourceCode.ui.menu;
import SourceCode.ui.reader;

public class payRoll {

    public static void main(String[] args)
    {
        boolean check = true;
        String choice="0";
        while(check)
        {
            menu.mainshow();
            choice = reader.get();
            switch(choice){
                case "1":
                    insert.insertEmployee();
                    break;
                case "2":
                    getData.showAllEmployees();
                    break;
                case "3":
                    System.out.println("Exiting....... Bye! ");
                    check = false;
                    break;
                default:
                    System.out.println("We are in the process ,don't be over smart give a valid Input.");
                    break;
            }
        }
    }
}