##### So far we've covered:
- Installing an IDE
- Creating and Navigating a project
- Writing comments
- Methods (instructions) belong to Classes (matter)

# Chaining

To tell Java how to get somewhere, we need to use a specific syntax.

The way Java understands this is with "chaining" - 

what this will look like for us is we're going to precede "print" with directions to that method.

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

We still need to define what each of these mean.

But as long as we speak in a way that Java understands,

Java can not just mow lawns, but build houses, coordinate city-wide efforts, light the entire nation -

we just have to be more and more detailed the bigger the project gets.