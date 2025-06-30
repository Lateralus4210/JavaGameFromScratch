package quest.remember.example;

import java.util.Objects;
import java.util.Scanner;

public class UserInput {
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";
    private static final String BOLD = "\u001B[1m";

    public void run() {
        System.out.println("Welcome to the game!");

        boolean userHasPlayedBefore = false;

        if (userHasPlayedBefore) {
            System.out.println("Welcome back, yo!");
        } else {
            System.out.println("Welcome! For the first time in history!");
        }

        Scanner s = new Scanner(System.in);

        System.out.print("Enter something: ");
        String input = s.nextLine();
        System.out.println("You entered: " + input);

        if (Objects.equals(input, "I'm the master")) {
            System.out.println("Okay I get it! You're the master.");
        } else {
            System.out.println("Hm. Appears you are not the master.");
        }

        System.out.print(BLUE + "Enter something, again: " + RESET);
        input = s.nextLine();
        System.out.println(BLUE + "You entered: " + input + RESET);

        if (Objects.equals(input, "I'm the master")) {
            System.out.println(GREEN + "Okay I get it! You're the master." + RESET);
        } else {
            System.out.println(RED + "Hm. Appears you are not the master." + RESET);
        }

        s.close();

        System.out.println(RESET + "The program will close now - RESET");
        System.out.println(BOLD + "The program will close now - BOLD" + RESET);
        System.out.println(RED + "The program will close now - RED" + RESET);
    }
}
