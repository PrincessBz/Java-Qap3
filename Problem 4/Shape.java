
public abstract class Shape {
    protected String name; 

    // Constructor 
    public Shape(String name) {
        this.name = name;
    }

    // Getter method for the name
    public String getName() {
        return name;
    }

    // Abstract methods to calculate area and perimeter
    public abstract double getArea();
    public abstract double getPerimeter();

   
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
