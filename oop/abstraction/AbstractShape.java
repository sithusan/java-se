package oop.abstraction;

public abstract class AbstractShape {

    protected double width;

    protected double height;

    public AbstractShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public abstract double getArea();
}
