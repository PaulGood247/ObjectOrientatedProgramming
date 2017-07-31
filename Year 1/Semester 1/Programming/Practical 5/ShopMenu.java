import java.util.*;
public class ShopMenu
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        
        char choice;
        
        System.out.println("Computers 'R' Us");
        System.out.println("----------------");
        System.out.println("");
        System.out.println(" Which product would you like to buy:");
        System.out.println("    Computer");
        System.out.println("    Laptop");
        System.out.println("    Tablet");
        System.out.print(" Enter your choice (1, 2 or 3): ");
        choice = sc.next().charAt(0);
        
        switch(choice)
        {
            case '1': System.out.println("You chose a Computer");
            break;
            case '2': System.out.println("You chose a Laptop"); 
            break;
            case '3': System.out.println("You chose a Tablet"); 
            break;
            default: System.out.println("Invalid entry");
        }
    }
}
            