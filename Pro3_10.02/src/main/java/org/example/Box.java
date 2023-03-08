package org.example;

public class Box {

    public double width;
    public double height;
    public double depth;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }


    public Box(double width, double height, double depth) {
        if (width < 0) {
            this.width = -width;
        }
        this.height = height;
        this.depth = depth;
    }
    public void print() {
        System.out.println("width: " + width + " height: " + height + " depth: " + depth);
    }



    public Box() {

    }
}
