package alibi;

import processing.core.PImage;
import processing.core.PApplet;

import java.util.List;

public class Dino {
	// makes the cap on how tall the jump height should be before it stops the dino from going up
	// if there are magic numbers, make them constants at the top 
	private final int jumpHeight = 13;

	// need x and y positions to know where it is on screen
	private int x;
	private int y;
	private int yVelocity = 0;
	private int ground;

	private boolean alive = true; 
	/*
	his solution for detecting when the dinosaur collides with a cactus is for the dinosaur to know where the cactuses are... :/ 
	maybe if it where me i would put that method inside the application. 
	because the application would already know all the cactuses and dinosaurs are it can just be calculated inside the application rather than inside the dinosaur. 
	and instrad of having a private boolean inside the dinosaur that detects whether its alive, that boolean would be inside the application. and would handle the game over sequence
	
	that makes more sense to me BUT because this is the lecture and is learning imma copy it straight up
	*/
	private List<Cactus> cacti;

	// image of the sprite
	private PImage sprite;

	public Dino(int x, int y, PImage sprite, List<Cactus> cacti){
		this.x = x;
		this.y = y;
		// sets the ground as the initial y value (where the dinosaur is originally placed, this is used later to make sure it doesnt go below the original y value)
		this.ground = y;
		this.sprite = sprite;

		this.cacti = cacti;
	}

	//in games and applications you always need the methods tick() and 
	// handles the logic inside the app. its to seperate code that does the behind the scenes things here
	public void tick(){
		// everytime its called, the y position increases bu the velocity (the higher the y value the lower on the screen it is so by minusing it goes up )
		this.y -= this.yVelocity;
		if (this.y > this.ground){
			// just sets the y as the ground
			this.y = this.ground;
			// and makes it 0 so it stops going into the ground
			this.yVelocity = 0;
		} else {
			// decreases the y velocity because gravity so it doesnt 
			this.yVelocity--;
		}
		
		this.checkCollision();
	}

	// it handles the graphics and what is displayed on the the app. ideally it should only be a couple lines just to put things on here. there shouldnt be any if statements or logic
	// it is passing in a reference to the actual object so the methods within that parameter are actually affecting the real thing
	public void draw(PApplet app){
		// can reference the app 
		// using the method "image" to display the image at the coordinates given, and displays it with the actual app
		app.image(this.sprite, this.x, this.y);
	}

	public void jump(){
		// add y velocity only if its on the ground
		if (this.y == this.ground){
			this.yVelocity = this.jumpHeight; 
		}
		// if the y is less than the ground that means it shouldnt be able to jump
	}

	public void collide(){this.alive = false;}

	// go through all the cacti and check we are colliding with them
	public void checkCollision(){
		// if we have 2 sprites, represented by rectagles, it can be below above, inside. to check for collisions you would check the corners of the rectangles and whether they intersect each otehr
		// if the corners are within the rectangle tehre is a collision
		// using PImage you can get the width and height of the sprite

		
		for (Cactus cactus : cacti){
			// if our x coordinate is over the cactus' x coordinate that means the cactus must have passed the dinosaur and is going through it
			// when you get the X values for PImage its the top left of every sprite
			
			int cactusLeft = cactus.getX();
			// gets the other side of the image cactus
			int cactusRight = cactus.getX() + cactus.getWidth();
			int cactusTop = cactus.getY();
			// remember the smaller the y value is, the closer it is to the top of the screen (0,0 is top right in the applet)
			int cactusBottom = cactus.getY() + cactus.getHeight();

			int dinoRight = this.x + this.sprite.width;
			int dinoBottom = this.y + this.sprite.height; 

			// IT IS NOT EQUALS TO BECAUSE IT IS CHECKING IF THE IMAGES ARE OVERLAPPING if cactus is inside the right there is a collision
			// if "bounds" of the dinosaur the left and the right sides of it. have the cactus' coordinates inside then a collision is triggered 
			if ((dinoRight > cactusLeft && this.x < cactusRight) && (dinoBottom > cactusTop && this.y < cactusBottom)){
				this.collide();
				return;
			}

			// if ((dinoRight > cactusLeft && dinoRight < cactusLeft) && (this.y > cactusTop && this.y < cactusBottom)){
			// 	this.collide();
			// 	return;
			// }
			
			// // checking collisions for the dinosaur's left side
			// // if the top left corder is somewhere between the walls of the dino then a collision is trigger
			// if ( (this.x > cactusLeft && this.x < cactusRight) && (this.y > cactusTop && this.y < cactusBottom) ){
			// 	this.collide();
			// 	return;
			// }
		}
	}
}