void setup()
{
  size(512, 512);
  background(255, 250, 250);

}
void draw() {
  stroke(50);
  outline();
  
}

void outline(){
    fill(255,255, 0);
    triangle(256, 50, 156, 200, 356, 200);
}

void mousePressed(){
    outline();
    eye();
    pupil();
    browz();
    textAlign(CENTER, BOTTOM);
    text("ILLUMINATI CONFIRMED", 256, 230);
    redraw();
}

void eye(){
  fill(255, 250, 250);
  arc(256, 130, 95, 45, PI, 2*PI);
  arc(256, 130, 95, 45, 0, PI);
 
}

void pupil(){
  stroke(7);
  fill(0);
  ellipse(256, 130, 12, 45);
}

void browz(){
    stroke(20);
    fill(255, 255, 0);
    arc(256, 100, 65, 12, PI, 2*PI);
}
