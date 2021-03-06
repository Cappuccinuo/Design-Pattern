package SRP;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final List<String> entries = new ArrayList<String>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
