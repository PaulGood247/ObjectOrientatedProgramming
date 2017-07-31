
public class Date
{
    private int day;
    private int month;
    private int year;
    
    
    
    public void setDay(int dayIn)
    {
        day=dayIn;
    }
    public void setMonth(int monthIn)
    {
        month=monthIn;
    }
    public void setYear(int yearIn)
    {
        year=yearIn;
    }
    public int getDay()
    {
        return day;
    }
    public int getMonth()
    {
        return month;
    }
    public int getYear()
    {
        return year;
    }
    public void theDate()
    {
        System.out.print(day+" - "+month+" - "+year);
        
    }
}

