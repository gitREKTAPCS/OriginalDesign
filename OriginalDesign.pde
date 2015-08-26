

void setup()
{
	size(512, 512);
	
}
void draw(){
outline();
}

void mousePressed() {
PImage img=loadImage("http://www.mactrast.com/wp-content/uploads/2015/02/grey-ink-illuminati-eye-logo-tattoo-design.jpg");
texture(img);
triangle(256, 50, 156, 200, 356, 200);
}

void outline(){
triangle(256, 50, 156, 200, 356, 200);
 }