public abstract class Shape {
   protected String name;

   // Constructor
   public Shape(String name) {
      this.name = name;
   }

   // Abstract method to calculate area
   public abstract double getArea();
   public abstract double getPerimeter();

   @Override
   public String toString() {
      return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter() + "\n";
   }

    
}