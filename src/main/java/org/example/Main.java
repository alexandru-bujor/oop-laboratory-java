package org.example;
import org.example.task1.Display;
import java.util.Scanner;
import org.example.task2.FileReader;
import org.example.task2.TextData;
import org.example.task3.Assistant;
import javax.swing.JOptionPane;

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

                    String filePath = "C:\\Users\\sandu\\IdeaProjects\\oop-laboratory-java\\src\\main\\java\\org\\example\\task2\\testing.txt";
                    String fileName = filePath.substring(filePath.lastIndexOf("/") + 1); // Extract file name

                    String text = FileReader.readFileIntoString(filePath);

                    if (text.isEmpty()) {
                        System.out.println("No text to process.");
                        return;
                    }

                    TextData textData = new TextData(fileName, text);
                    System.out.println(textData);
                    break;
                case "3":
                    System.out.println("Starting task 3: \n");
                    Display[] displays = new Display[]{
                            new Display(1920, 1080, 300.5f, "Dell UltraSharp"),
                            new Display(2560, 1440, 350.0f, "LG UltraFine"),
                            new Display(3840, 2160, 400.0f, "Samsung Smart Monitor"),
                            new Display(1440, 900, 67.0f, "AOC"),
                            new Display(1366, 768, 60.0f, "HP Pavilion"),
                            new Display(1920, 1080, 100.0f, "Asus VivoBook"),
                            new Display(1600, 900, 120.0f, "Lenovo ThinkVision"),
                            new Display(1280, 720, 70.0f, "Acer Aspire"),
                            new Display(1920, 1080, 150.0f, "ViewSonic Elite"),
                            new Display(3440, 1440, 110.0f, "LG UltraWide"),
                            new Display(2560, 1080, 95.0f, "Samsung Curve"),
                            new Display(3840, 1080, 130.0f, "Dell DualScreen"),
                            new Display(1920, 1200, 200.0f, "Eizo FlexScan"),
                            new Display(1360, 768, 80.0f, "Philips Compact"),
                            new Display(1024, 768, 50.0f, "BenQ Eco")
                    };
                    Assistant newassist = new Assistant("DisplayHelp");

                    // Assign all displays to the assistant
                    for (Display display : displays) {
                        newassist.assignDisplay(display);
                    }

                    newassist.assist();
                    newassist.buyDisplay(displays[1]);
                    newassist.buyDisplay(displays[6]);
                    newassist.buyDisplay(displays[10]);
                    newassist.assist();


                    break;
                case "5":
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
            }
        } while (true);





    }
}


