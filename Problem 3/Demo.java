public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 5.0);
        shapes[1] = new Ellipse(4, 6);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(5);
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println();
        }
    }
}
