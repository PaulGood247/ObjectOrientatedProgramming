import java.util.*;
public class Count20
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Please enter a number over 20: ");
        num=sc.nextInt();
        
        if(num>=20)
        {
            for(int i=20 ; i <=num ; i++)
            {
                System.out.println(i);
            }
        }
        else
        {
            System.out.println("Invalid number - must be greater than 20");
        }
        
        
    }
}