import java.util.*;
public class Average5
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int total;
        total=0;
        int average;
         for ( int i=1 ; i<=5; i++)
         {
             
             System.out.print5("Please enter a number: ");
             int num;
             num=sc.nextInt();
             total=total+num;
             
             
         }
         
         System.out.println("The total of the 5 numbers entered is: " + total);
         average=total/5;
         System.out.println("The average of the 5 numbers entered is: " + average);
         
              
         }
    }
                
      


