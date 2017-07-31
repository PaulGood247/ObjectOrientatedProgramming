
public class Car
{
    private int year;
    private String make;
    private int speed;
    
    
    
    public void setYear(int yearIn)
    {
        year=yearIn;
    }
    public void setMake(String makeIn)
    {
        make=makeIn;
    }
    public void setSpeed(int speedIn)
    {
        speed=speedIn;
    }
    
    public int getYear()
    {
        return year;
    }
    public String getMake()
    {
        return make;
    }
    public int getSpeed()
    {
        return speed;
    }
    
    public void accelerate()
    {
        speed=(speed+5);
        
    }
    public void brake()
    {
        speed=(speed-5);
        
    }
}
