package org.example;
import org.example.task1.Display;

public class Main {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        Display d1 = new Display(1080, 1920, 96.0f, "Samsung");
        Display d2 = new Display(1440, 900, 67.0f, "AOC");

        d1.compareSize(d2);
        d1.compareSharpness(d2);
        d1.compareWithMonitor(d2);


    }
}


