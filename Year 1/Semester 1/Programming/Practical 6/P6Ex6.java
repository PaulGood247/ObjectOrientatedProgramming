import java.util.*;
public class P6Ex6
{
  public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        
        char choice;
        int balance=100;
        int withdraw=0;
        int deposit=0;
        
        
        
        
        
        do
        {
            System.out.println("Bank Online");
            System.out.println("");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            System.out.println("");
            System.out.print("Enter your choice: ");
            choice=sc.next().charAt(0);
            
            switch(choice)
            {
                case '1':
                System.out.println("How much do you want to withdraw ");
                withdraw=sc.nextInt();
                balance=balance-withdraw;
                System.out.println("Your new balance is : " +balance);
                break;
                case '2':
                System.out.println("How much do you want to deposit ");
                deposit=sc.nextInt();
                balance=balance+deposit;
                System.out.println("Your new balance is : " +balance);
                break;
                case '3':
                System.out.println("Your balance is: "+balance);
                break;
            }
            System.out.print("Do you want another option (y/n)? ");
            choice=sc.next().charAt(0);
            if(choice=='4' || choice=='n' || choice=='N')
            {
                ;
            }
        
            
        }while(choice!='4' || choice!='n' || choice!='N');
        System.out.println("Thank you and goodbye!");
    }
    
}
