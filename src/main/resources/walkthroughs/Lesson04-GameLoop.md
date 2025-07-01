# What we have so far

So the essence of our game is this:
The terminal prints some text, then awaits the user's input.
With even that, the most basic of scripts, we could spend years developing 
games from that.

            Interactive Fiction (IF) games
                Colossal Cave Adventure maps
                Counterfeit Monkey
                Anchorhead

So we have to start with giving the user some kind of option.
Maybe the character wakes up in a bed in a jungle -
you can ask the player: look up, peer into the darkness, or listen carefully?
Or maybe the game is built on a cartesian plane - 
you could ask the player: west, south, east, north?

Whatever options we're giving the player, their choice needs to influence the 
progression of the game somehow..
meaning the user's choices need to direct our code somehow.

The simplest way to do this would be if statements.
For a few that would work well, but if we were to try developing our game for a
few days only using if statements, it might not work so well.
(But maybe it could? Idk maybe the simplicity of it would make it worth giving a shot)

But typically that's not the way it would be done. What we would probably want to do 
first is make the code more repeatable -

Say we did actually nest all those if statements - if we wanted to go back later and 
turn the text green or red or yellow, we would need to go back in and hit each instance
where we mention "println" followed by the terminal text.

No matter what we do, we'll have to type all that text at least once while we're coding
but it's best to try to ensure we're only tasked to type it once.

What I suggest is to create a variable inside println that we call something like
currentText; now if we look at the number of unique lines we've got,
it goes from all of these - maybe 9 or so
Down to one unique line, repeated 9 different times.

This on its own isn't very exciting, but what is exciting is that redundant code looks
exactly like an opportunity for defining a method that gets executed when we call it.

So we might make a method called "ShowCurrentText" which is just "println(currentText)".

Now, if we want to go in and change the font color of the entire terminal text,
we can do it in ONE spot instead of NINE places, or one hundred or even a thousand.

But we're still calling ShowCurrentText() nine times over, so perhaps it would be wise 
to create another method that both updates the UserInput as well as calls ShowCurrentText().

But here's the question - how do we make it so we don't have to call the function nine times,
but it will still run nine times (or more)?

Because right now you can see we're just going from start to finish -
It will only run ShowCurrentText() as many times as I have typed it out here.

What we need is to set our code up to keep running this until we say stop - 
not run it once and then stop.

# The Game Loop

For this, we can employ loops - there are two types of loops:
for loops, which do it FOR a certain number of times
and while loops, which run until something we decide changes.

So in order to run it forever, we're going to trick Java in a way and tell it to run
until some *thing* becomes false. Basically while we're playing the game, this thing
is considered True, and while we're not playing the game this thing is considered False.
This is the game loop, and it's how we're going to get our program to run forever.

```java
package quest.remember.JavaGameFromScratch;

import java.util.Scanner;

public class Main {
static Scanner s = new Scanner(System.in); // Make Scanner static so that it is accessible in refreshTerminal()
// Making an object static allows it to be seen at the class level.

    public static void main(String[] args) {

        while (true) {
            refreshTerminal();
        }

    }

    public static void refreshTerminal() {
        String u = s.nextLine();
        System.out.println("Hm. " + u + ", you say?");
    }
}
```

so basically, this thing is going to run our command as fast as it possibly can.
If it wasn't waiting on our input, it might run hundreds of times per second.

Later, we could set it up so the game runs on ticks instead (so instead of running the
program as fast as possible, it updates just a few times per second instead).

But for our purposes it doesn't matter.

What's important is now the program knows to ask as often as possible "What's next?"
instead of reaching a clear end point.

Since our game is a finite path, the game loop doesn't do a lot right now, but one
important thing it does do is it allows us to hop back in where we left off if the 
user inputs incorrect info. For instance, if we say 4 instead of 1 2 or 3, we can
cause the program to say "That's not right!" and then give the user the option to 
try again - instead of failing and needing to start from the top again.

Even though our game is finite right now, we might include elements that will require
the game loop - like if the player wants to take a break from the story to check their
inventory or save the game, the option to do that has to be there (at least most of the time),
which necessarily means that Java has to be checking periodically if the user is
doing that thing.

We're going to avoid implementing systems like inventories and saving for this game,
but combat could be doable. In this case, the game would usually give the player
options to choose from, but it might also periodically throw the character into combat.

By the way, player refers to the person holding the controller or playing the game,
and character refers to the avatar in the game. The player is saving the game but
the character is in battle.

I find this is an important distinction to make when developing games because it gets
murky if you want to have a playerName and a characterName, for example, or if you want
to separate your user input logic from the actual fantasy elements (like, the character
having a poison effect has nothing to do with the last time the player logged on, as a 
specific example - you would want to separate these into a Character class and a Player
class, IMO)

This would also be a good time to talk about naming conventions
Classes are capitalized at every word: PlayerLoginInfo.java or .class
Methods also take this format i think?
Variables are camel-cased: currentPlayerHealth = 43 or doDaylightCycle = true
Constants are capitalized: GAME_ID, WINDOW_DIMENSIONS
    Constants are technically variables in that they hold a value, but they're different
    in that the value is not expected to change over the course of the game (like
    player's distance traveled, for instance).

So we're back to our RefreshTerminal() method, which still just belongs to the Main class.
Again, we're writing this in Main for simplicity, but typically all Main would do
is get your program running and your other class files would take over from there.
We're defining RefreshTerminal as a method for simplicity, but for scalability we 
would probably want to make it a class instead - much more robust.

Right now, our method will work for what we're trying to do.
But maybe we want to customize the behavior, or even allow the user to customize
the behavior. That logic is going to get pretty complicated inside a single method.

Inside it we'll clear the terminal, we'll set the currentText then show it, and then
we'll await the user's input.
*/