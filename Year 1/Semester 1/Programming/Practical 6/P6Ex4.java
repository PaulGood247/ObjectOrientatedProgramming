import java.util.*;
public class P6Ex4
{
  public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        
        String name ;
        int StudentNum;
        String address; 
        int age;
        char choice;
        
        do
        {
          System.out.print("Enter you name: ");
          name=sc.next();
        
          System.out.print("Enter your student number: ");
          StudentNum=sc.nextInt();
        
          System.out.print("Enter your Address: ");
          address=sc.next();
        
          System.out.print("What age are you ");
          age=sc.nextInt();
        
          System.out.print("Would you like to enter another student details (y/n): ");
          choice = sc.next().charAt(0);
           if(choice=='N' || choice == 'n' ||choice=='Y' || choice=='y')
                 {
                     ;
                 }
           else
                 {
                    System.out.print("Invalid character. Please re-enter (y/n) " );
                    choice = sc.next().charAt(0);
                 }

        
        
        }while(choice == 'y' || choice == 'Y');
        
        System.out.println("Goodbye and thank you for using the system!");
      
    }
}

