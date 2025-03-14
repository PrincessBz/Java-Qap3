public class Point{
// Attributes
    private float  x;
    private float y;

// Constructors
    public Point()
    {
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

// Setters and getters
    public void setX(float x) 
    {
        this.x = x;
    }
    public  float getX()
    {
        return x;
    }
    public void setY(float y)
    {
        this.y = y;
    }
    public float  getY()
    {
        return y;
    }

    public void setXY(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public float[] getXY()
    {
        return new float[]{this.x, this.y};
    }

    @SuppressWarnings("override")
    public String toString()
    {
        return("("+this.x+","+this.y+")"); 
    }

}
    