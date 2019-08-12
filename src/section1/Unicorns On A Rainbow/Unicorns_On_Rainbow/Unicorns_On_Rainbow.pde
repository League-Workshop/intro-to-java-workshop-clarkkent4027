PImage rainbow;
PImage unicorn;
void setup() {
 rainbow=loadImage("rainbow image.jpg");
 size(800,600);
 rainbow.resize(800,600);
 unicorn = loadImage("373-3734790_download-png-unicorn-clipart-silhouette-png-transparent-png.png");
unicorn.resize(300,150);
}

void draw() {
background(rainbow);
if (mousePressed){

image(unicorn,mouseX,mouseY);}
}
