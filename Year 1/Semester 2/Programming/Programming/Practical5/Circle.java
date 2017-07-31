
public class Circle
{
    private int radius;
    private double pi;
    
    public Circle()
    {
        pi=3.14159;
    }
    
    
    public void setRadius(int radiusIn)
    {
        radius=radiusIn;
    }
    
    
    
    public int getRadius()
    {
        return radius;
    }
    public double getPi()
    {
        return pi;
    }
   
    
    public double diameter()
    {
        double diameter;
        diameter=(radius*radius);
        return diameter;
    }
    public double area()
    {
        double area;
        area=(pi*radius*radius);
        return area;
        
    }
    public double circumference()
    {
        double circum;
        circum=(2*pi*radius);
        return circum;
        
    }
}
