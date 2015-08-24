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
public void draw()
{
 outline();
 nose();
 eyes();
}

public void nose(){
	fill(0, 0, 0);
	triangle(256, 280, 200, 300, 312, 300);

}

public void eyes(){
	ellipse(150, 100, 50, 100);
}

public void outline(){
	noFill();
	ellipse(256, 256, 500, 500);
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
