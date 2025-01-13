package org.example.task3;
import org.example.task1.Display;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assistant {
    String assistantName;
    List<Display>  assignedDisplays;

    public Assistant(String assistantName) {
        this.assistantName = assistantName;
        this.assignedDisplays = new ArrayList<>();
    }
    public void assignDisplay(Display d) {
        assignedDisplays.add(d);
        System.out.println("Assigned display" + d+"\n");
    }

    public void assist(){
        if (assignedDisplays.size() < 2) {
            System.out.println("Not enough displays for comparisson. Minimum 2.");
            return;
        }
        System.out.println("Starting comparisson:\n");
        for (int i = 0; i < assignedDisplays.size()-1; i++) {
            Display fd1 = assignedDisplays.get(i);
            Display fd2 = assignedDisplays.get(i+1);
            System.out.print("Comparing "+fd1.model+" and "+fd2.model+"\n");
            fd1.compareWithMonitor(fd2);
        }
    }
    public void buyDisplay(Display d) {
        System.out.println("Starting the process of display purschase:\n");

        System.out.print("You bought the display " + d.model + "\n");
        assignedDisplays.remove(d);


    }
}
