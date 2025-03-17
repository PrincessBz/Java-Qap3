public class Triangle extends Shape {
    protected  double side1;
    protected  double side2;
    protected  double side3;

    // Default constructor
    public Triangle() {
        super("Triangle");
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // Constructor with parameters
    public Triangle(double side1, double side2, double side3) 
    {
        super("Triangle");
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalArgumentException("Invalid side lengths for a triangle.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }





}