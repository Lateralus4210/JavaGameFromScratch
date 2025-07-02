##### So far we've covered:
- Installing an IDE
- Creating and Navigating a project
- Writing comments
- Methods (instructions) belong to Classes (matter)
- Chaining
- Defining methods
- Printing to the terminal
- The Scanner class
- Instantiating a class (making an object)
- Interactive Fiction
- The game loop
- Syntax for classes, methods, variables (parameters) and constants

private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";
    private static final String BOLD = "\u001B[1m";



        // Simulate clearing line
        System.out.print("\033[1A"); // Move cursor up 1 line
        System.out.print("\033[2K"); // Erase the line