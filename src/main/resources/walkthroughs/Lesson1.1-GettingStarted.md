# Software We'll Need

So we want to make a game in Java.

We could theoretically just do this in something like Notepad, or even Microsoft Word.

But what we could really use is an environment that is fit for developing code - 

it'll give us a huge advantage over using a simple text editor.

Think about how when you're in Microsoft Word, there are all kinds of tools to accomplish making a document.

Spell check, text formatting like bold and italics and underline, and ways to split the page into sections.

What we need is a piece of software that has similar helpful tools, but for writing programs, not for writing documents.

Since our goal is to write in Java, we have two main options - 

The first is Microsoft Visual Studio Code, or VSC.

This one is robust and fast - it can handle writing in any language.

This is a great one to have on hand if you're getting into development because of its flexibility.

But it's not as specialized as other pieces of software, which means that writing Java could be made much easier, 
if we use a piece of software made for it.

I suggest using IntelliJ IDEA: Community Edition. It's free and curated towards development in Java.

There are a lot of quality-of-life differences, like auto-suggests, a built-in viewer for external libraries and a
package wizard that will build templates of Java programs.

>As an example, if you're modding Minecraft: Java Edition, you can use the package wizard to create a mod specifically 
for Fabric 1.16.4, or Forge 1.21.6.

There's no such wizardry in VSC. Grab IntelliJ IDEA! From here I'm going to assume that's the software you're using.

Once you've started installing it, choose all the default options - the custom options aren't very relevant if you're 
just starting.

After it's installed and opened, select File > New > Project... and it will bring up the Project Wizard.

# Create a New Project

On the left we can see the types of projects we can create - we want to choose Java.

A piece of software made in Java needs to have certain files and folders in a certain place, and the project wizard
will take care of all of that.

We're going to name our project something descriptive - I would recommend against using a date or version here,
because that's bound to change as we work on our project.

If you're using GitHub to make sure your files are saved to the cloud and shareable, you're going to have to commit
to a name and probably be okay with not changing (without a minor headache).

I'll call this project JavaGameFromScratch.

You don't have to check "Create a Git repository" - you always have the option of turning this into a Git repo later.

Stick with Gradle - basically what the build system does is track dependencies. Not too important for us right now.

The JDK is the Java Development Kit - it's essentially all the files needed to run Java code on your computer.

Pick the newest version you've got (for me that's JDK 22).

Stick with Groovy. Also, I wouldn't recommend adding the sample code. Its intent is to be helpful, but it can 
clutter things.

Leave ArtifactId the way it is (it should match your project name). 

You'll probably leave GroupId alone for now, but you *would* change this if you owned a domain name by putting that domain name, reversed.

The GroupId essentially just separates your code from code made by other people.

From there, hit Create and your new project will be open inside of IDEA.

# Navigating the Project

In the future, when you come back to work on this project, you would need to do this by going to File > Open... 
and then navigating to your Project Folder.

Make sure you're opening your project folder, and not src, build, etc. Our code will only work if our actual project
is open.

Check out the left-hand side of your IDE.

This is the navigator, or the explorer, and it should be opened to your project folder.

You can check this by making sure the top-level directory says the name of our project - then underneath that it should
have at least a "src" folder.

"src" is the directory we're mainly going to be working in. The rest of these top-level folders and files are configuration
files and other boilerplate code we won't need to touch for a long time.

Before anything else, we have to open:

```/ {ProjectName} / src / main / java / {package/name} / Main.java```.

My personal path looks like this, because my domain name is remember.quest:

```/ JavaGameFromScratch / src / main / java / quest / remember / Main.java```.

If we were the people who had written Minecraft, our project folder might look like this:

```/ Minecraft / src / main / java / net / minecraft / Main.java```

Once we've got Main.java open, we get to type our first code snippet!

