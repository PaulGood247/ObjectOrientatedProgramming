public class EmployeeTest
{
    public static void main(String[]args)
    {
        
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        emp1.setFirstName("Bob");
        emp1.setSecondName("Jones");
        emp1.setSalary(1000);
        emp2.setFirstName("Susan");
        emp2.setSecondName("Baker");
        emp2.setSalary(2500);
        
        System.out.println("        Employee Salaries");
        System.out.println("");
        System.out.println("Employee 1: "+(emp1.getFirstName())+" "+(emp1.getSecondName()));
        System.out.println("Monthly Salary: "+(emp1.getSalary()));
        System.out.println("Monthly Salary: "+((emp1.getSalary()*12)));
        System.out.println("");
        System.out.println("Employee 2: "+(emp2.getFirstName())+" "+(emp2.getSecondName()));
        System.out.println("Monthly Salary: "+(emp2.getSalary()));
        System.out.println("Monthly Salary: "+((emp2.getSalary()*12)));
        System.out.println("");
        System.out.println("        Incresing Employee Salaries by 10%");
        System.out.println("");
        System.out.println("Employee 1: "+(emp1.getFirstName())+" "+(emp1.getSecondName()));
        System.out.println("Monthly Salary: "+(((emp1.getSalary())/100)*110));
        System.out.println("Monthly Salary: "+(((((emp1.getSalary())/100)*110)*12)));
        System.out.println("");
        System.out.println("Employee 2: "+(emp2.getFirstName())+" "+(emp2.getSecondName()));
        System.out.println("Monthly Salary: "+(((emp2.getSalary())/100)*110));
        System.out.println("Monthly Salary: "+(((((emp2.getSalary())/100)*110)*12)));
        System.out.println("");
    }
}