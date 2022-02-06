package oop.abstraction;

public class ShapeTest {
    public static void main(String[] args) {

        // subclass of AbstractShpae
        AbstractShape rectangle = new Rectangle(10, 20);
        showArea(rectangle);

        // object creation by anonymous class
        AbstractShape shape = new AbstractShape(20, 30) {
            @Override
            public double getArea() {
                return width * height;
            }
        };
        showArea(shape);
    }

    static void showArea(AbstractShape shape) {
        System.out.printf("Area of rectangle is %.2f\n", shape.getArea());
    }
}
