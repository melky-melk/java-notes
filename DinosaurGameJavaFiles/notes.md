look at guides.gradle.org creating new gradle builds

for assignment we get given a scaffold 
build.gradle is the build file for the project, what programs its using what things it needs to run, if there are any plugins and etc


there are plugins {
	language
	id 'java'
	what you are making
	id 'application 
	for test cases
	id 'jacoco'
}

dependencies {
	what it needs to use, google has libraries if you need to make stuff
	implementation

	junit is a way to test java code, integration test, unit tests so forth
}

application {
	main class of the application .App class
}

inside main is where the actual files are where you do the actual coding for the game

resources are not source code just like sprites and shit you need to make things

inside DinoTest.java inside test folder you would need to import and put the testcases there, make a new class inside test, import 
```java
package alibi;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
```

can make test cases extend from other classes

# TYPE THIS SHIT INTO THE FUCKIN TERMINAL

**gradle run** 
runs the things and opens an app, compiles everything. plays around with git if git is set up
**gradle test**
gradle test compiles and runns all the test cases
**gradle jacocoTestReport**

package called processing, processing language is built on top of java
PApplet is the window that pops up, it is the processing.core
you can add images set framerates, 
xvfb-run /mnt/c/"Local Files"/University/YR1/"SEM 2"/java/Week8/Lecture/DinosaurGame --sketch=/mnt/c/"Local Files"/University/YR1/"SEM 2"/java/Week8/Lecture/DinosaurGame/

C:\Local Files\University\YR1\SEM 2\java\Week8\Lecture\DinosaurGame
cd \Week8\Lecture\DinosaurGame

# REALLY GOOD NOTES TAKEN FROM THE SUPS
try to avoid magic numbers by making private final attributes at the top of the class. like jumpHeight 

for the dino and cactus, you could simply make an abstract class, or an interface to group them together. (i think an abstract will work better here because its two sprites rather than like, 2 classes that have the same methods, they are both very much related objects). 

tick to represent logic of the game. to isolate logic from the graphics, when you make unit tests its easier to do it. modularity enables you to test specific features easily

without it you would need to test graphics and the other individually

if you have repeated things you can get rid of it to reduce redundancies in code

his solution for detecting when the dinosaur collides with a cactus is for the dinosaur to know where the cactuses are... :/ maybe if it where me i would put that method inside the application. because the application would already know all the cactuses and dinosaurs are it can just be calculated inside the application rather than inside the dinosaur. and instrad of having a private boolean inside the dinosaur that detects whether its alive, that boolean would be inside the application. and would handle the game over sequence
BUT because this is the lecture and is learning imma copy it straight up

global is bad for memory and is also bad coding practice

if we have 2 sprites, represented by rectagles, it can be below above, inside. to check for collisions you would check the corners of the rectangles and whether they intersect each otehr
if the corners are within the rectangle tehre is a collision

when you get the X values for PImage its the top left of every sprite
the y value is the top of the sprite