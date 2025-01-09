package org.example;
import org.example.task1.Display;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        do {
            System.out.println("Select an option: \n");
            System.out.println("1-Task 1: \n");
            System.out.println("2-Task 2: \n");
            System.out.println("3-Task 3: \n");
            System.out.println("4-Task 4: \n");
            System.out.println("5-exit: \n");
            Scanner scanner = new Scanner(System.in);
            String inputMain = scanner.nextLine();
            System.out.println("----------------------------");

            switch (inputMain) {
                case "1":
                    System.out.println("Starting task 1: \n");

                    Display d1 = new Display(1080, 1920, 96.0f, "Samsung");
                    Display d2 = new Display(1440, 900, 67.0f, "AOC");
                    d1.compareSize(d2);
                    d1.compareSharpness(d2);
                    d1.compareWithMonitor(d2);
                    break;

                case "2":
                    System.out.println("Starting task 2: \n");
                    break;

                case "5":
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
            }
        } while (true);






    }
}


