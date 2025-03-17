public class Demo
{
    public static void main(String[] args)
   {
    Scalable[] shapes = new Scalable[4];
    shapes[0] = new Circle("Circle", 5.0);
    shapes[1] = new Ellipse("Ellipse", 4.0, 6.0);
    shapes[2] = new Triangle("Triangle", 3.0, 4.0, 5.0);
    shapes[3] = new EquilateralTriangle("EquilateralTriangle", 5.0);
    for (Scalable shape : shapes) {
        System.out.println(shape);
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.println();
    }
        scaleShapes(shapes, 2.0);

        System.out.println("After scaling by 2.0:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println();
        }
    }

    public static void scaleShapes(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}