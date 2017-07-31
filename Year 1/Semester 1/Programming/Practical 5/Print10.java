import java.util.*;
public class Print10
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num;

        for(int i = 1 ; i<=10; i++)
        {
           
            System.out.print("Please enter a number: ");
            num=sc.nextInt();
            System.out.println("The number you entered is: " +num);
        }
    }
}

