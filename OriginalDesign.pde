void setup()
{
	size(512, 512);
}
void draw()
{
 outline();
 nose();
 eyes();
 mouth();
}

void nose(){
	fill(0, 0, 0);
	triangle(256, 300, 230, 300, 283, 300);

}

void eyes(){
	ellipse(150, 100, 50, 100);
	ellipse(360, 100, 50, 100);
}

void outline(){
	noFill();
	ellipse(256, 256, 500, 500);
}

void mouth(){
	strokeWeight(5);
	line(150, 400, 360, 400);
}
