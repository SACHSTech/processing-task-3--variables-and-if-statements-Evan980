import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
    public void setup() {
    //Set background to blue
    background(135, 205, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// Stroke settings for foreground
    stroke(0, 255, 0);
    strokeWeight(4);

    fill(140, 70, 20);

  //Foreground
    rect(width/-20, (float) (height*.9375),(float) (height*1.1), height);
   
  //Roof
    triangle(width/2,(float)(height*.15),(float) (width*.775),(float) (height*.375),(float) (width*.225),(float) (height*.375));

  //Body of house
    rect((float) (width*.225),(float) (height*.375),(float) (width*.55),(float) (height*.375));

  // Colour and stroke settings for sun
    fill(255, 255, 0);
    strokeWeight(1);
    stroke(0);

  //Sun
    ellipse(width*0, height*0, width/2, height/2);

  //Colour for window
    fill(255, 255, 255);

  //Window
    ellipse(width/2,(float) (height*.2625), width/20, height/20);
  }
  

}