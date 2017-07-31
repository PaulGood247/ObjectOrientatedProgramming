
public class Employee
{
        
    private String firstName;
    private String secondName;
    private double salary;
    
    public Employee()
    {
        salary=0;
    }
    
    public String getFirstName()
    {
       return firstName;  
    }
    public String getSecondName()
    {
       return secondName;  
    }
    public double getSalary()
    {
       return salary;  
    }
    public void setFirstName(String firstNameIn)
    {
       firstName=firstNameIn;  
    }
    public void setSecondName(String secondNameIn)
    {
       secondName=secondNameIn;  
    }
    public void setSalary(double salaryIn)
    {
       salary=salaryIn;  
    }
}
