// makes folders of the classes so its not one giant thing
package alibi;

import processing.core.PApplet;
// needs to import this bitch for the sprites to appear
import processing.core.PImage;

public class Cactus {
	private int x;
	private int y;
	// has an xVelocity because it is moving across the x axis of the game
	private int xVelocity;

	private PImage sprite;

	public Cactus(int x, int y, PImage sprite){
		this.x = x;
		this.y = y;
		this.xVelocity = xVelocity;
		this.sprite = sprite;
	}

	public void tick(){
		// changes the x position down so it moves across the screen 
		this.x -= xVelocity;
	}

	public void draw(PApplet app){
		// draw the sprite onto the app
		app.image(this.sprite, this.x, this.y);
	}

	public int getX(){return x;}
	public int getY(){return y;}
	public int getWidth(){return this.sprite.width;}
	public int getHeight(){return this.sprite.height;}
}