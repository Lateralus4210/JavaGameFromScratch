##### Concepts we've covered so far:
- Installing an IDE
- Creating and Navigating a project
- Chaining
- Syntax
- Classes and methods (briefly)

> You can jump ahead to Lesson2.1 if you want to begin typing code and playing around without any explanation. Lesson1
> will provide a lot of prerequisite knowledge that Lesson2 requires, however, so come back to this if things aren't making sense!

---

# Our First Code

Inside /src/main/java/.../java.main, we'll type this:

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

But when we do try to run this, the program says, "What?"

Instead of just typing a random piece of text, we need to actually tell our program to do something with it.
In other words, we need to write a command.

In Java, I happen to know that writing to the console is called "printing." So let's try this command:

```java
print("Welcome to the game!");
```

But that doesn't work either...

But, this is a good stopping point, because if we go any further toward getting this to work, without explaining it, 
it is likely to just leave you confused.

From here on, I encourage the reader to read and re-read sections if necessary, because these concepts are abstract
and can be difficult to comprehend at first.

# Methods

Let's look at the print() method we're trying to use.

```java
print("Welcome to the game!");
```

So the part we've got right is that we need to use a command to get Java to do something, and print is the right
"command".

(Btw, Java refers to these "commands" as methods.)

The part we're missing is this:

This method actually exists on our computer as part of the Java files we installed.

Whatever it is that that method does, somebody had to write the code for it, and you have it on your computer now.

That method actually exists in a separate file, and we need to access that file in our own file, so we can use it in 
our own code.

This file is called a class file.

# Classes

If you were to look at a class file, it's basically just a list of methods and some relevant information.

A lot of people say that a class is a list of instructions

but I think it goes deeper and more abstract than that.

Think about getting a set of build instructions with a piece of furniture from IKEA.

In programming, a class isn't *just* those build instructions -

a class can function as the paper it's written on and the ink it's written with, it can function
as the screws, the screwdriver, a class could be a timer to see how long it takes you to build it -

and it can get as complex as writing a class that makes up the delivery driver automaton bringing it to you and the van they brought it in. It could also make up the
street it's driving on... the city you live in... the planet you live on.

At first, it's difficult to comprehend the implications here.

What's important to know is that classes are so essential to programming in Java and other OOPs - they're not
just instructions of how to build something - they're the digital molecules that make up entire worlds.

With that said, we can talk about why our print statement isn't working yet.

The big takeaway is - there is a class that "print" belongs to, and we have to tell Java where in the "world" it can be found.

So because we know "print" belongs somewhere, we have to tell Java where it's looking for a method called "print".

# Chaining

The way Java understands this is with "chaining" - so we're going to precede "print" with directions to that method.

As a real life example, this is kind of like how you have Address Number + Street + Zip + City + State.

The way humans might understand this is 8720 Fourth Street, 90210, Los Angeles, California.

But the way Java would understand this - in the style of "chaining" - is to replace some of these spaces with dots,

And also to start from General to Specific instead of Specific to General.

So, 8720 Fourth Street, 90210, Los Angeles, California, becomes

```json
California.LosAngeles.90210.FourthStreet.8720
```

# Talking to Java (Javier)

From here, we're going to imagine you have a human friend who only understands if you speak in Java syntax.

He'll be called Javier.

To tell him where you live, you would have to give the chained address for him to understand what you're saying.


```java
California.LosAngeles.90210.FourthStreet.8720
```

We've given him our address, so he shows up - but we haven't told him what to do yet.

As soon as we've found some things for Javier to do, we open the door and, talking in the syntax Javier understands, 
we say:

```java
OpenGarageDoor();
RemoveLawnmowerFromGarage();
StartLawnmower();
MowAroundThePerimeter();
MowCenterOfLawn();
UseWeedeater();
```

These don't mean much on their own -

At the very least, Javier knows from the parentheses () that we intend to do something.

And he knows we're done speaking because we used the semicolon.

But this is the first time Javier has done this, so he needs your help.

We need to define what each of these mean.

But as long as we speak in a way that Java understands,

Java can not just mow lawns, but build houses, coordinate city-wide efforts, light the entire nation -

we just have to be more and more detailed the bigger the project gets.