
public class Circle extends Shape implements Scalable {
    private double radius; 

    // Constructor 
    public Circle(String name, double radius) {
        super(name); 
        this.radius = radius;
    }

    // Getter 
    public double getRadius() {
        return radius;
    }

   
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }


    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


    @Override
    public void scale(double factor) {
        this.radius *= factor;
    }
}
