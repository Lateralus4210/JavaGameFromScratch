# What we have so far

So we've got our program talking back to us. We know once we've reached this point in the code, it should print this
statement. If it does, we're in good shape!

Since it works, that only means one thing, which is: it's time to implement more functionality.

Maybe we want to be able to talk back to the program as well.

The way we do this is by "scanning" for user input. After we tell Java to scan, it will wait for whatever we say
and remembers it until we stop the program.

So since we're referencing a method that scans for user input, we need to tell Java where to find it.

However, this one is different from what we did before because this is located somewhere that's not automatically
accessible to Java like "System" is.

So we need our first import statement! This will grab all the classes and methods from a particular spot and make them
known to the file we're working in here.

The class we're importing happens to be located at java.util.Scanner.

import java.util.Scanner;

Now this is pretty cool because Java is now capable of listening to what we have to say and behaving appropriately.

So we can assume from before that we want to use some kind of method to command Java to do something.

Maybe scan()? Maybe java.util.Scanner.scan()?

Actually, it goes a little further than that - the method isn't as simple as scan.

By the way, if this were right, we wouldn't need to call the entire statement java.util.Scanner.scan();
since we've imported it, this file now is totally familiar with the class "Scanner,"
and as far as it's concerned, we can refer to it as Scanner.

But it's still not Scanner.scan() -

and the thing is, we can't use Scanner like that yet, and the conceptual reason is this:

Even though this file is intimately familiar with the idea of a "Scanner,"
there isn't an actual *Scanner* at all, yet.

This is called an *instance* of a class. We need to make an actual Scanner that is an instance of the Scanner class. 

In other words, once we instantiate a class, a real Scanner "object" now exists to Java -

To build on the IKEA furniture example, the "instructions" aren't enough (or important at all, really) unless someone
uses it to make something.

And that thing that we make, using the class file (or instructions), is called an object.

What we don't have in our file yet is a Scanner object.

We have the instructions to create a Scanner, but not an actual Scanner.

So in order to create a Scanner object, we can start here:

new Scanner;

Now, this next part could use some clarification, because I'm going to add parentheses here, but not for the same reason:

new Scanner();

If we recall that () usually denote a method -
 it's not immediately obvious what method we're calling.

The truth is, the "method" we're calling is basically "MakeOneOfTheseThings()" and that's why the parentheses are there.

But Java won't let us just create a new instance of an object without giving it a name.

We're also going to need to refer to this object later if we want to use it, so we have to give it a name

We can call it anything at all like:

lilScannerBoy = new Scanner();

but to save time on typing complicated names, it would probably be better to use the simplest name possible.

s = new Scanner();

But there's one more modification we need to make:

Java needs us to be clear on what we're trying to make at the start of the line.

Just like we can't create an object without giving it a name, we can't give it a name without first saying
what it actually is.

So, even though it looks redundant, in order to make a new Scanner object, we write:

Scanner s = new Scanner();

By the way, just like "String" was the data type of "Skyler" earlier, and "Integer" was the data type of 1202,
"Scanner" is the data type of this variable s.

Java is very picky about what knowing what data types you're talking about *before* you talk about them.

So with this line, we actually have a Scanner object whose name is s.

We've come a long way, but there's still one final step to getting this correct.

In case I haven't mentioned it before, the reason certain statements end with () in Java is because that's
actually a slot for passing in additional information.

For instance, going back to Javier, when we inform him of the whole mowLawn() method, we can additionally say

"Hey, if I say one more thing when I say mowLawn(), that's the days I want you to come back and do this"

So we could say mowLawn("Thursday");

Or if we needed him to come more often (like when grass is 2 inches), maybe we write the method so that we're allowed to say mowLawn(2).

Likewise, we need to pass a parameter into our Scanner object so that it knows what exactly it's scanning.

In its current state, it *is* scanning, but it doesn't know to scan for user input.

So we're going to take a note from our System.out earlier, and instead of System.out we're going to pass in System.in

So basically, whatever we are passing into the system, that's what you should be scanning for.

Now! is the time for our method we were looking to call earlier -

back when we were thinking maybe there was a scan() method or something.

We're going to start by referring to the object we want to do something with (s) and when we add a .
it will autosuggest some things we'll want to do.

What we're looking for is nextLine();

Basically, we're using the Scanner to scan for the next line.

Because think about it: when the Scanner runs, it inserts a line break and wait for whatever you say.

So scanner has a built-in method that listens to that "next line".

But again, even if the user enters something, we can't use whatever they enter for anything later on, unless we name it.

So we could call this userInput maybe.

userInput = s.nextLine();

Now, if we run this, we can type something in at this point, the program saves it as a thing called userInput, and
then it closes. It goes "okay, got it, goodnight now"

We need to tell it what else to do. but first we actually need to be trying to do something.

We could say System.out.print("What is your name??");

Then here the program should listen...

and then after it saves what we say, we want it to print another line that says

println(userInput + "is a pretty radical name, I must say!")

That's pretty good, but don't forget to put another space here.

Now when we type our name in, it says "Zach is a pretty radical name, I must say!"