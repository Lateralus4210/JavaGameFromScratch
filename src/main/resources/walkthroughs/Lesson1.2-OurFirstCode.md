##### So far we've covered:
- Installing an IDE
- Creating and Navigating a project

> You can jump ahead to Lesson2.1 if you want to begin typing code and playing around without any explanation. Lesson1
> will provide a lot of prerequisite knowledge that Lesson2 requires, however, so come back to this if things aren't making sense!

---

# Our First Code

There should be a Main.java file inside of src/main/java/{package name}. Open that up, and type this:

```java
package quest.remember;
// or your package (mine is quest.remember)

public class Main {
    public static void main(String[] args) {
    }
}
```

At first, the complexity of this line is best ignored. 

Why it reads this way isn't totally important at this point, but the fact it needs to read that way IS all-important.

> The compiler (which is the thing that actually reads and executes your code) won't be able to run your program 
> unless it sees this sequence at the start of everything else.

Making the program do more doesn't require the same level of complexity as these first few lines.

The very first thing we should work on is making sure our program runs by giving the simplest instructions of all: 
printing text to the terminal.

First let's try writing "Welcome to the game!" with a semicolon to show Java that we're done with what we have to say.

>By the way, I'll use // to write comments within the code, which you can do in your software too. The compiler will 
ignore everything from the end of // to the end of that line when you run your program.

```java
package quest.remember;
// or your package (mine is quest.remember)

public class Main {
    public static void main(String[] args) {
        
        
        "Welcome to the game!" // <<< I CAN COMMENT HERE AT THE END OF THE LINE
        
// COMMENTS CAN ALSO TAKE UP THEIR OWN LINE
                                            // and be written wherever you want them
    
    
    }
}
```

We can try running this code hitting the play button.

When we do, the terminal will open up in the bottom of the window to keep us updated.

But with the way we currently have it written, the program says, "What?"

Instead of just typing a random piece of text, we need to actually tell our program to do something with it.
In other words, we need to write a command.

In Java, writing to the console is called "printing." So let's maybe try this command:

```java
print("Welcome to the game!");
```

But that doesn't work either...

But, this is a good stopping point, because if we go any further toward getting this to work, without explaining it, 
it is likely to just leave you confused.

From here on, I encourage the reader to read and re-read sections if necessary, because these concepts are abstract
and can be difficult to comprehend at first.

