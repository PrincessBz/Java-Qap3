
public class Triangle extends Shape implements Scalable {
    private double side1; 
    private double side2; 
    private double side3; 

    // Constructor
    public Triangle(String name, double side1, double side2, double side3) {
        super(name); 

       
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
            System.out.println("Error: The given sides cannot form a triangle.");
            System.exit(1); 
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getter and setter methods for side1, side2, and side3
    public double getSide1( ) {
        return side1;
    }

    
    public void setSide1(double side1) {
        this.side1 = side1;
    }


    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void scale(double factor) {
        this.side1 *= factor;
        this.side2 *= factor;
        this.side3 *= factor;
    }
}
