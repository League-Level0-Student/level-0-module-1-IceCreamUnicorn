void setup(){
      size(1000,1000);
fill(132,97,96);
ellipse(500,500,400,400);
fill(#FF0533);
ellipse(500,500,350,350);
fill(#FFC905);
ellipse(500,500,335,335);

    }

    void draw(){
      PImage vegetables = loadImage("vegetables.png");
image(vegetables, 350, 350);
    }
