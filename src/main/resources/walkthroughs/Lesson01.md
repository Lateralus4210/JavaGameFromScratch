# Getting Started

Before anything else, we must navigate to:

```/ {ProjectName} / src / main / java / {package/name} / Main.java```.

```/ JavaGameFromScratch / src / main / java / quest / remember / Main.java```.

```java
package quest.remember;
// or your package (mine is quest.remember)

public class Main {
    public static void main(String[] args) {
    }
}
```

At first, the complexity of this line is best ignored. 

Why it reads this way isn't totally important at this point, but the fact it needs to read that way IS all-important (the JVM won't be able to run your program unless it sees this sequence at the start of everything else). 

Making the program do more doesn't require the same level of complexity as these first few lines.

    The very first thing we should work on is making sure our program runs by giving the simplest instructions of
    all, which is printing to the terminal

    First we write "Welcome to the game!" with a semicolon to show Java that we're done with what we have to say.

"Welcome to the game!";

  But the program basically says, "what?"

   So instead of just typing a random string, we'll tell it to do something:
   In Java, writing to the console is called "printing."

//    print("Welcome to the game!");

//      This is a good stopping point, because if we go any further toward getting this to work without explaining it
//      is likely to leave you confused.

//      So the reason this still isn't quite right is we're trying to use what's called a method (which is just a command),
//      and methods don't just exist
//      everywhere at once; they *belong* somewhere. They belong in the file that they were defined in.
//      This file is called a class file.

//      Btw, what is a class? It's usually described as a set of instructions, but IMO it's a bit more abstract than that.
//      Think about getting a set of build instructions with a piece of furniture from IKEA.
//      In programming, a class isn't *just* those build instructions -
//      a class can function as the paper it's written on and the ink it's written with, it can function
//      as the screws, the screwdriver, a class could be a timer to see how long it takes you to build it -
//      and it can get as complex as writing a class
//      that makes up the delivery driver automaton bringing it to you and the van they brought it in. It could also make up the
//      street it's driving on... the city you live in... the planet you live on.

//      At first, it's difficult to comprehend the implications here.

//      What's important to know is that classes are so essential to programming in Java and other OOPs - they're not
//      just instructions of how to build something - they're the digital molecules that make up entire worlds.

//       With that said, we can talk about why our print statement isn't working yet.

//      The big takeaway is - there is a class that "print" belongs to, and we have to tell Java where in the "world"
//      it can be found.

//      So because we know "print" belongs somewhere, we have to tell Java where it's looking for a method called "print".
//      The way Java understands this is with "chaining" - so we're going to precede "print" with directions to that method.

//      As a real life example, this is kind of like how you have Address Number + Street + Zip + City + State.

//      The way humans might understand this is 8720 Fourth Street, 90210, Los Angeles, California.

//      But the way Java would understand this - in the style of "chaining" - is to replace some of these spaces with dots,
//      and to start from General to Specific instead of Specific to General.

//      So, 8720 Fourth Street, 90210, Los Angeles, California, becomes

//      California.LosAngeles.90210.FourthStreet.8720

//      From here, we're going to imagine you have a human friend who only understands if you speak in Java syntax.
//
//      To tell them where you live, you would have to give the chained
//      address for them to understand what you're saying.

//        California.LosAngeles.90210.FourthStreet.8720

//      One more thing we should talk about before moving on -
//      Giving your Java friend that address only tells them where to find something, but it doesn't tell them how to do anything.

//      This is important because Java is infinitely more useful to us if he can *do* something!

//        So Java is looking for something to do -
//      And Java only has one place to look so far, because the only address you've told him so far is your address.

//      So Java is standing right outside your door, waiting to be told how to be helpful.

//      As soon as we've found something for Java to do, we can open the door and, talking in the syntax Java understands,
//      we can say:

//        OpenGarageDoor();
//        RemoveLawnmowerFromGarage();
//        StartLawnmower();
//        MowAroundThePerimeter();
//        MowCenterOfLawn();
//        UseWeedeater();
//
//      These don't mean much on their own - Java knows from the parentheses that we intend to do something

//      And he knows we're done speaking because we used the semicolon.

//      But this is the first time Java has done this, so he needs your help.
//
//      We need to define what each of these mean. In other words, we need to be very specific about
//        how each of these plays out, if we want our yard to still look nice when Java is finished mowing it.

//        If we're not specific enough, or if we're specific in the wrong way, Java will be knocking on your door
//        moments after starting to say something went wrong.

//        But as long as we speak in a way that Java understands (and we have lots of ways of learning how to speak to Java),
//        Java can not just mow lawns, but build houses, coordinate city-wide efforts, light the entire nation -
//        we just have to be more and more detailed the bigger the project gets.

//        Defining one of these methods can be incredibly complex or mind-numbingly simple.

//      Inside of "RemoveLawnmowerFromGarage()" we might define code that tells Java to check the battery and the gas
//        first before trying to StartLawnmower().

//      Inside of UseWeedeater(), there might be instructions for how to hold it to cut the grass but not Java's shins, and
//        an internal check that won't allow Java to UseWeedeater() unless he is wearing safety glasses.

//      Of course, if we're being literal, all of these commands come at the end of your address, because you're the guy
//        telling Java how to do these things. The person who owns this house is "defining" the "methods."

//      Let's shorten that address for clarity - let's call it FourthStreet.8720

//      So to make sense to our Java friend, we would say:

//        FourthStreet.8720.OpenGarageDoor();
//        FourthStreet.8720.RemoveLawnMowerFromGarage();
//        etc.

//      And Java would say, "Okay, got it! Can you tell me how to OpenGarageDoor? How do I RemoveLawnMowerFromGarage?"

//      And you would have to walk through each one of these - but after you did, Java would know how to do it from start to finish.

//      But say that Java shows up at your house the next week and is looking for a job -

//        And we want Java to do the same things as last week - only we don't want to walk through the entire thing again.

//      It would be awfully convenient to be able to just reference the instructions from the past week and say -

//        "Remember what you did last week? Just do all that again."

//        As a matter of fact, we could wrap this entire logic (all 6 methods) inside its own method called MowLawn().

//        So like this:

//        method MowLawn():
//              OpenGarageDoor();
//              RemoveLawnmowerFromGarage();
//              StartLawnmower();
//              MowAroundThePerimeter();
//              MowCenterOfLawn();
//              UseWeedeater();
//



//      Let's take this a step further and write a little more pseudocode.

//        So the next day, when Javier shows up, you say, "from now on,
//              if FourthStreet.8720.grassLength > 4: FourthStreet.8720.mowLawn();"

//        And now Javier will periodically come check the length of grass at that address, and the moment it is greater than
//        4 inches, Java will run through the entire set of instructions and you wind up with a clean lawn!

//        By the way, you may have noticed I used grassLength at the end of the address -

//        this isn't a method (we can tell because there isn't any parentheses)

//        This is actually a variable. These just hold values, instead of holding instructions.

//        When a variable belongs to a class, it's called a parameter.

//      Back to making a game!

//      Now that we've met our friend Javier and understand some of the ways we have to communicate to make things work between us,
//        we can see why something like "print" doesn't do anything.

//      Your friend Java doesn't know what "print" is, unless it also knows where to go to ask what that means.

//      So in this case, "print" turns into System.out.print - the "print" function is defined within the System class, in the
//        System object "out" - important later but not super important this moment!

//        That may have been pretty in-depth to just get one single print statement on the screen -
//        but these are concepts that need to be talked about eventually, and the earlier you understand them,
//        the earlier things will click.
