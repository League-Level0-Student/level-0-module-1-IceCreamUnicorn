  import ddf.minim.*;  


Minim minim;     //at the top of the sketch
AudioPlayer sound; 
void setup(){
   
      size(1000,1000);
fill(132,97,96);
ellipse(500,500,400,400);
fill(#FF0533);
ellipse(500,500,350,350);
fill(#FFC905);
ellipse(500,500,335,335);
minim = new Minim(this);     
sound = minim.loadFile("ding.wav");
    }

    void draw(){
      PImage vegetables = loadImage("vegetables.png");
      if(mousePressed){
image(vegetables, mouseX, mouseY);
}
sound.play();
sound.rewind();
    }
