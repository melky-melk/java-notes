// makes folders of the classes so its not one giant thing
package alibi;

import processing.core.PApplet;
// needs to import this bitch
import processing.core.PImage;

import java.util.ArrayList;
import java.util.Random;

// app is an extension of PApplet so it can use some of the methods specified in there
public class App extends PApplet {

	// constant attributes 
    public final int WIDTH = 500;
    public final int HEIGHT = 330;

	// just make the sprites an attribute of the class
	// PImage is how PApplet represent images. load image passes in an image and returns a PImage
	// uses the newly made class Dino
	private Dino dino;
	// have a list of cacti that spawn into the world
	private ArrayList<Cactus> cacti = new ArrayList<Cactus>();
	private int timer = 100;

	private PImage cactusSprite = this.loadImage("src/main/resources/cactus.png");
	private Random rand = new Random();

	public App(){
		// initiallizing shit goes here but i like to do it in attrivutes because im an asshole, the way you would do it tho is
		// this.timer = 100; 
		// this.rand = new Random();
		// and so on
	}

	// sets the window 
    public void settings() {
        size(WIDTH, HEIGHT);
    }

	// where all the loading of the game occurs
    public void setup() {
		// calls the method inside PApplet to set the framerate to 60
        frameRate(60);

        // Load images here
		// the attribute equals the new image loaded in
		// Syntax: this.spriteImage = this.loadImage("filepath")
		
		// initially specifies the coordinates as 30, 200 and the PImage
		this.dino = new Dino(30, 200, this.loadImage("src/main/resources/dino1.png"), cacti);

		// a new cactus is initially added to the list of cacti
		// starts with the x velocity as 5, can make it faster over time if ur feeling extra
		this.cacti.add(new Cactus(400, 210, 5, this.loadImage("src/main/resources/cactus.png")));
		
    }

    public void draw() {
		// main loop here it is called however many times per second specified in the frame rate
		// so in this case 60 times a second
		// this.image(dino, 0, 0 ) is a method inside PApplet than you can call to display the dino object  0,0 base coordinate is top left 

		// calls the tick methods within each class
		this.dino.tick();
		
		// goes through every cactus inside
		for (Cactus cactus : this.cacti){
			cactus.tick();
		}

		// TODO check for a better way to update the screen, draws a rectangle the size of the entire window to refresh the screen and clear it of thinsg. 
		// the default colour is white
		this.rect(-1, -1 , WIDTH + 2, HEIGHT + 2);

		// needs an app as the parameter, so it gives itself (the app itself) as a pointer so it can be manipulated 
		this.dino.draw(this);

		// goes through every cactus in the list
		for (Cactus cactus : this.cacti){
			cactus.draw(this);
		}

		// the timer is decremented, supposed to represent how long it is untill another cactus spawn
		this.timer --;

		// when the timer hits 0 anotehr cactus spawns
		if(this.timer <0){
			cacti.add(new Cactus(540 , 210, 5, this.loadImage(cactusImage)));
			// ensures that the time gives a number between 40 and 100
			this.timer = this.rand.nextInt(60) + 40;
		}

    }

	public void mousePressed() {
		this.dino.jump();
	}

	// runs the actual app in a different windo
    public static void main(String[] args) {
        PApplet.main("alibi.App");
    }
}
