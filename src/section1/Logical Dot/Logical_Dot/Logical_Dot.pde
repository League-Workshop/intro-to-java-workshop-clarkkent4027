

void setup() {
size(600,600);  
}

void draw() {
fill(#05FF34);
if (mousePressed) {
  fill(255,0,0);
} else {
  fill(0,255,0);
}
ellipse(300,300,150,150);
}
