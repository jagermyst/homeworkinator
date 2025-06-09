// Created by Jagermyst
import java.util.Scanner;

public class Homeworkinator {

    static void createHomework() {
        //TODO for now this will have no args; this will need to be changed to ask the
        // user which student we are making homework for
        HwFactory hwFactory = new HwFactory();
    }

    static void createStudent() {
        System.out.println("what is the new students name?");
    }
    static void createSubject() {
        System.out.println("Subject");
    }

    static void studentReport() {
        System.out.println("Which student would you like a report on?");
    }

    static String stringCleaner(String userInput) {
        //TODO make this method sanitize user input by removing spaces, etc.
        return userInput;
    }

    static boolean selector(boolean exit) {
        // initalize scanner and ask user for input
        Scanner input = new Scanner(System.in);

        String selection = input.nextLine();
        selection = stringCleaner(selection);

        // calls a method based on the users selection
        switch (selection) {
            case "1":
                //TODO: prompt user for a topic or student in here
                createHomework();
                break;
            case "2":
                System.out.println("TODO: print a report on the student");
                break;
            case "3":
                System.out.println("TODO: create a new student");
                break;
            case "4":
                System.out.println("TODO: CREATE A NEW TOPIC FILE");
                break;
            case "5":
                System.out.println("TODO: DELETE A STUDENT FILE");
                break;
            case "6":
                //TODO: FIGURE OUT WHY THIS IS NOT EXITING THE PROGRAM
                exit = true;
                break;
            default:
                System.out.println("please type in a number 1-6");
                break;
        }
        return exit;

    }


            public static void main(String[] args) {
                // prompt asking for a selection
                System.out.println("Welcome to the HOMEWORKINATOR!");
                System.out.println("please choose what you would like to do today (1-6):");
                System.out.println("1. create a study assignment");
                System.out.println("2. get a report on a student");
                System.out.println("3. create a new student");
                System.out.println("4. create a new subject of homework");
                System.out.println("5. delete a student");
                System.out.println("6. exit program");
                boolean exit = false;
                while (!exit){
                    exit = selector(exit);
                }

            }
        }

