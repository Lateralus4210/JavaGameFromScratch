# Talking to Java (Javier)

From here, we're going to imagine you have a human friend who only understands if you speak in Java syntax.

He'll be called Javier.

To tell him where you live, you would have to give the chained address for him to understand what you're saying.


```java
California.LosAngeles.90210.FourthStreet.8720
```

One more thing we should talk about before moving on:

Giving Javier your address only tells him *where* to find something...

but it doesn't tell him *how* to do anything (yet).

This is important because Javier is infinitely more useful to us if he can *do* something!

So Javier is standing right outside your door, waiting to be told how to be helpful.

As soon as we've found something for Javier to do, we open the door and...

talking in the syntax Javier understands, we say:

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

# Defining Methods

Defining a methods can either be incredibly complex or incredibly simple.

Inside "RemoveLawnmowerFromGarage()" we might define code that tells Java to check the battery and the gas first before trying to StartLawnmower().

Inside UseWeedeater(), there might be instructions for how to hold it to cut the grass but not Java's shins, and an internal check that won't allow Java to UseWeedeater() unless he is wearing safety glasses.

And you would have to walk through each one of these once - but after you did, Javier would know how to do it from start to finish.

But say that Javier shows up at your house the next week and is looking for a task -

And we want Javier to do the same things as last week - only we don't want to walk through the entire thing again.

It would be convenient to be able to just reference the instructions from the past week and say -

"Remember what you did last week? Just do all that again."

As a matter of fact, we could wrap this entire logic (all 6 methods) inside its own method called MowLawn().

So like this:

```java
method MowLawn():
      OpenGarageDoor();
      RemoveLawnmowerFromGarage();
      StartLawnmower();
      MowAroundThePerimeter();
      MowCenterOfLawn();
      UseWeedeater();
```


Now, if we're being literal about what the syntax requires...

all of these commands come at the end of your address, because you're the guy telling Java how to do these things. 

The person who owns this house is "defining" the "methods."

Let's just shorten that address for clarity - let's call it FourthStreet.8720

So to make sense to our Javier, who understands Java, we would say:

```java
FourthStreet.8720.OpenGarageDoor();
FourthStreet.8720.RemoveLawnMowerFromGarage();
etc.
```
Let's take this a step further and write a little more pseudocode.

  So the next day, when Javier shows up, you say, "from now on,

```java
        if FourthStreet.8720.grassLength > 4: FourthStreet.8720.mowLawn();"
```

  And now Javier will periodically come check the length of grass at that address, and the moment it is greater than
  4 whatevers, Java will run through the entire set of instructions and you wind up with a clean lawn!

  By the way, you may have noticed I used grassLength at the end of the address -

  this isn't a method (we can tell because there aren't parentheses) though it's chained like one.

  This is actually a variable. These just hold values, instead of holding instructions.

  When a variable belongs to a class, it's called a parameter.

Now that we've met our friend Javier and understand some of the ways we have to communicate to make things work between us,
  we can see why something like "print" doesn't do anything.

Your friend Java doesn't know what "print" is, unless it also knows where to go to ask what that means.

So in this case, "print" turns into System.out.print - the "print" function is defined within the System class, in the
  System object "out" - important later but not super important this moment!

Another way to think about it is we need to send Javier to the "System" street, at the house "out" so he can ask
the person who lives there to show him how to "print."

  That may have been pretty in-depth to just get one single print statement on the screen -
  but these are concepts that need to be talked about eventually, and the earlier you understand them,
  the earlier things will click.
