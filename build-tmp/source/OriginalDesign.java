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
public void draw() {
  stroke(50);
  outline();
  
}

public void outline(){
    fill(255,255, 0);
    triangle(256, 50, 156, 200, 356, 200);
}

public void mousePressed(){
    outline();
    eye();
    pupil();
    browz();
    textAlign(CENTER, BOTTOM);
    text("ILLUMINATI CONFIRMED", 256, 230);
}

public void eye(){
  fill(255, 250, 250);
  arc(256, 130, 95, 45, PI, 2*PI);
  arc(256, 130, 95, 45, 0, PI);
 
}

public void pupil(){
  stroke(7);
  fill(0);
  ellipse(256, 130, 12, 45);
}

public void browz(){
    stroke(20);
    fill(255, 255, 0);
    arc(256, 100, 65, 12, PI, 2*PI);
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
