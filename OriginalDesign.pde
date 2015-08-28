void setup()
{
  size(512, 512);
  
}
void draw() {
  stroke(50);
  outline();
  eye();
  pupil();
  browz();
}

void outline(){
    noFill();
    triangle(256, 50, 156, 200, 356, 200);
}

void eye(){
  noFill();
  arc(256, 125, 75, 25, PI, 2*PI);
  arc(256, 125, 75, 25, 0, PI);
 
}

void pupil(){
  stroke(7);
  fill(0);
  ellipse(256, 125, 12, 25);
}

void browz(){
    stroke(20);
    noFill();
    arc(256, 100, 65, 12, PI, 2*PI);
}