
public class Employee
{
    private String number;
    private String name;
    private String department;
    private int yearsService;
    private String grade;
    
    public Employee(String numberIn, String nameIn,String departmentIn, String gradeIn  )
    {
       number=numberIn;
       name=nameIn;
       department=departmentIn;
       grade=gradeIn;
       yearsService=0;
    }
    
    public void setNumber(String numberIn)
    {
        number=numberIn;
        
    }
    public void setName(String nameIn)
    {
        name=nameIn;
        
    }
    public void setDepartment(String departmentIn)
    {
        department=departmentIn;
        
    }
    public void setGrade(String gradeIn)
    {
        grade=gradeIn;
        
    }
    
    
    public String getNumber()
    {
        return number;
        
    }
    public String getName()
    {
        return name;
        
    }
    public String getDepartment()
    {
        return department;
        
    }
    public String getGrade()
    {
        return grade;
        
    }
    
}
