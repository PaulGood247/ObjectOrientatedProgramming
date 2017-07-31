import java.util.*;
public class P6Ex3
{
  public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        
        int age ;
        
        System.out.print("What age are you ");
        age=sc.nextInt();
        
        while (age <0 )
        {
            System.out.print("Invalid age. Please re-enter your age: ");
            age=sc.nextInt();
        }
       
        age++;
        System.out.println("Next year you will be "+age);
        
      
    }
}
