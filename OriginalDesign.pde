void setup()
{
	size(512, 512);
}
void draw()
{
 outline();
 nose();
 eyes();
}

void nose(){
	fill(0, 0, 0);
	triangle(256, 280, 200, 300, 312, 300);

}

void eyes(){
	ellipse(150, 100, 50, 100);
}

void outline(){
	noFill();
	ellipse(256, 256, 500, 500);
}
