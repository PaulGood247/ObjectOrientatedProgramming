
public class Rectangle
{
    private int width;
    private int length;

    
    
    
    public void setWidth(int widthIn)
    {
        width=widthIn;
    }
    public void setLength(int lengthIn)
    {
        length=lengthIn;
    }
    public int getWidth()
    {
        return width;
    }
    public int getLength()
    {
        return length;
    }
    public double area()
    {
        double area;
        area=width*length;
        return area;
    }
}
