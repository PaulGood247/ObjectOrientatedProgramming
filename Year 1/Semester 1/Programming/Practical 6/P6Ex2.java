import java.util.*;
public class P6Ex2
{
  public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        
        int year ;
        
        System.out.print("What year are you in ");
        year=sc.nextInt();
        
        while (year <=0 || year >=5)
        {
            System.out.print("Invalid year. Please re-enter your year: ");
            year=sc.nextInt();
        }
       
        
        System.out.println("Best of luck next year");
        
      
    }
}
