package org.example.task2;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    public static String readFileIntoString(String path) {
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return "";
        }
    }
}
