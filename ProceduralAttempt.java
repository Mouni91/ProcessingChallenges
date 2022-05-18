package org.example;

import processing.core.PApplet;

public class Main extends PApplet {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final int DIAMETER = 10;
    int startingPoint1 = 1;
    int startingPoint2 = 1;
    int startingPoint3 = 1;
    int startingPoint4 = 1;

    public static void main(String[] args) {

        PApplet.main("org.example.Main",args);
    }


    //To set the WIDTH and HEIGHT of the window
    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {

        //CircleOne
        ellipse(startingPoint1,HEIGHT/5, DIAMETER,DIAMETER);
        startingPoint1 = startingPoint1 +1;

        //CircleTwo
        ellipse(startingPoint2,2*(HEIGHT/5), DIAMETER,DIAMETER);
        startingPoint2 = startingPoint2 + 2;

        //CircleThree
        ellipse(startingPoint3,3*(HEIGHT/5), DIAMETER,DIAMETER);
        startingPoint3 = startingPoint3 + 3;

        //CircleFour
        ellipse(startingPoint4,4*(HEIGHT/5), DIAMETER,DIAMETER);
        startingPoint4 = startingPoint4 + 4;
    }

}