PImage img

void setup()
{
	size(512, 512);
	
}
void draw() {
  triangle(256, 50, 156, 200, 356, 200);
}


void mousePressed() {
img = loadImage("illuminati.jpg");
if (mousePressed && (mouseButton == LEFT)) {
    texture(img);
  }
