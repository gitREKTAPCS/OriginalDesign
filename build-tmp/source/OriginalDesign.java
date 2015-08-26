import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {



public void setup()
{
	size(512, 512);
	
}
public void draw(){
outline();
}

public void mousePressed() {
PImage img=loadImage("illuminati.jpg");
beginShape();
texture(img);
triangle(256, 50, 156, 200, 356, 200);
endShape();
}

public void outline(){
triangle(256, 50, 156, 200, 356, 200);
 }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
