

void setup()
{
	size(512, 512);
	
}
void draw(){
outline();
}

void mousePressed() {
PImage img=loadImage("illuminati.jpg");
beginShape();
texture(img);
triangle(256, 50, 156, 200, 356, 200);
endShape();
}

void outline(){
triangle(256, 50, 156, 200, 356, 200);
 }