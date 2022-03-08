import processing.core.PApplet;

public class Sketch extends PApplet {
  double randomx = random(-width, width);
  double randomy = random(-300, 300);
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
      size(400, 400);
    }

    public void setup() {
    //Set background to blue
    background(135, 205, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

  // Colour and stroke settings for sun
    fill(255, 255, 0);
    strokeWeight(1);
    stroke(1);

  //Sun
    float sunX = random(0, width);
    float sunY = random(0, height);

    if (sunX <= 250) {
      stroke(1);
      fill(100, 250, 0);
    }
    else {
      stroke(1);
      fill(0, 250, 0);
    }

    if (sunY >= 180 || sunY <= 225) {
      background(150, 20, 200);
    }
    else {
      background(20, 200, 50);
    }

    ellipse((float) ((width*0 + randomx)), (float) ((height*0 + randomy)), width/2, height/2);

 // Stroke settings for foreground
 stroke(0, 255, 0);
 strokeWeight(4);

 fill(140, 70, 20);

  //Foreground
    rect(width/-20, (float) (height*.9375),(float) (height*1.1), height);

  //Roof
    triangle(width/2,(float)(height*.15),(float) (width*.775),(float) (height*.375),(float) (width*.225),(float) (height*.375));

  //Body of house
    rect((float) (width*.225),(float) (height*.375),(float) (width*.55),(float) (height*.375)); //Colour for window
    fill(255, 255, 255);

  //Window
    ellipse(width/2,(float) (height*.2625), width/20, height/20);

  //Set variables for time
    int d = day();
    int m = month();
    int y = year();

    String s = String.valueOf(d);
    fill(4, 0, 120);
    textSize(15);
    text(month() + "-" + day() + "-" + year(), 0, 300);
  }
  

}