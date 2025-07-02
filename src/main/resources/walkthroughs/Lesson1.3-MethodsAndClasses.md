##### So far we've covered:
- Installing an IDE
- Creating and Navigating a project
- Writing comments

# Methods

Let's look at the print() "command" we're trying to use.

```java
print("Welcome to the game!");
```

So **the part we've got right** is that we need to use a command to get Java to do something, and print is the right
"command". (Btw, Java refers to these "commands" as methods.)

The **piece that's missing** is this:

This method actually exists on our computer as part of the Java files we installed.

Whatever it is that that method does, somebody had to write the code for it, and you have it on your computer now.

That method actually exists in a separate file, and we need to access that file in our own file, so we can use it in 
our own code.

This file is called a class file.

# Classes

If you were to look at a class file, it's basically just a list of methods and some relevant information.

A lot of people say that a class is a list of instructions

**but I think it goes deeper and more abstract than that.**

Think about getting a set of build instructions with a piece of furniture from IKEA.

In programming, a class isn't *just* those build instructions -

a class can function as the paper it's written on and the ink it's written with, it can function
as the screws, the screwdriver, a class could be a timer to see how long it takes you to build it -

and it can get as complex as writing a class that makes up the delivery driver automaton bringing it to you and the van they brought it in. It could also make up the
street it's driving on... the city you live in... the planet you live on.

>Classes in programming are like matter in real life.

At first, it's difficult to comprehend the implications here.

What's important to know is that classes are so essential to programming in Java and other OOPs - they're not
just instructions of how to build something - they're the digital molecules that make up entire worlds.

With that said, we can talk about why our print statement isn't working yet.

>The big takeaway is - there is a class that "print" belongs to, and we have to tell Java where in the "world" it can be found.

So because we know "print" belongs somewhere, we have to tell Java where it's looking for a method called "print".