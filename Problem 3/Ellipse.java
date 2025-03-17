public class Ellipse extends Shape {
   private final double a;
   private final double b;

    // Constructor
    public Ellipse(double a, double b) 
    {
        super("Ellipse");
        if (a < b) {
            double temp = a;
            a = b;
            b = temp;
       }
        this.a = a; 
        this.b = b;
    }

    // Area calculation
   @Override
    public double getArea()
    {
        return Math.PI * a * b;
    }

    // Perimeter calculation
   @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2);
    }
}