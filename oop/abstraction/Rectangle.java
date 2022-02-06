package oop.abstraction;

public class Rectangle extends AbstractShape {

    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
