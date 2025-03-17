
public class Ellipse extends Shape implements Scalable {
    private double majorAxis; 
    private double minorAxis; 

    // Constructor 
    public Ellipse(String name, double a, double b) {
        super(name); 
        this.majorAxis = Math.max(a, b);
        this.minorAxis = Math.min(a, b);
    }

    // Getter/ setter method 

    public double getMajorAxis() {
        return majorAxis;
    }


    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }
    
    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double getPerimeter() {
        double h = Math.pow((majorAxis - minorAxis), 2) / Math.pow((majorAxis + minorAxis), 2);
        return Math.PI * (majorAxis + minorAxis) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
    }

    @Override
    public void scale(double factor) {
        this.majorAxis *= factor;
        this.minorAxis *= factor;
    }
}
