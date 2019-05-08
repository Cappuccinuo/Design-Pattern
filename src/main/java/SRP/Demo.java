package SRP;

import java.io.File;

public class Demo {
    public static void main(String[] args) throws Exception {
        Journal j = new Journal();
        j.addEntry("I am happy.");
        j.addEntry("I want go home.");
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "journal.txt";
        p.saveToFile(j, filename, true);
        String name = "/Applications/Sublime Text.app";
        ProcessBuilder pb = new ProcessBuilder("open", filename);
        Process pp = pb.start();
    }
}
