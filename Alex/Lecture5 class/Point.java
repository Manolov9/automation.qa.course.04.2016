package com.company;
import java.lang.*;

/**
 * Created by Vesela on 19.4.2016 г..
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x=x;
        this.y=y;


    }

    public double calcDistance(Point p) {

        return Math.sqrt (
            (p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y)
        );
        }


    public int getX() {
        return this.x;

    }

    public void setX(int value) {

        this.x = value;
    }

    public int getY() {

        return this.y;
    }

    public void setY(int value) {
        this.y = value;
    }
}




