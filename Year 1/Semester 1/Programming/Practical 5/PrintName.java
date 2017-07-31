import java.util.*;
public class PrintName
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        
        String name;
        System.out.print("Enter your name: ");
        name = sc.next();
        
        for(int i = 1 ; i<=100; i++)
        {
            System.out.println(name);
        }
    }
}