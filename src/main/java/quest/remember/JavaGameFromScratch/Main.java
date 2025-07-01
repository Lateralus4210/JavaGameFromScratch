package quest.remember.JavaGameFromScratch;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in); // Make Scanner static so that it is accessible in refreshTerminal()
    // Making an object static allows it to be seen at the class level.

    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";
    private static final String BOLD = "\u001B[1m";

    public static void main(String[] args) {

        System.out.println("Go ahead and type.");

        while (true) {
            refreshTerminal();
        }

    }

    public static void refreshTerminal() {
        String u = s.nextLine();
        System.out.println("Hm. You said, \"" + u + "\"?");

        if(u.contains("!") && u.startsWith("W")) {
            System.out.println("Hm. " + RED + u + RESET + ", you say?");
        }
        if(u.contains("?")) {
            System.out.println("Hm. " + GREEN + u + RESET + ", you say?");
        }
        if(u.contains("@")) {
            System.out.println("Hm. " + BLUE + u + RESET + " looks like an email address.");
        }
        if(u.contains("fuck")) {
            System.out.println("GAHHHH...!!! " + BOLD + u + RESET + "?? I Can't Stand It !!!1!");
        }
    }
}
