import java.util.*;
public class P11Ex7
{
   public static void main(String[] args)
   {
       int [] numbers=new int[10];
       lessThan(numbers);
   }   

   public static void lessThan(int [] numbersIn)
    {
       Scanner sc=new Scanner (System.in);
       
        for(int i =0;i<numbersIn.length;i++)
       {
           System.out.print("Please enter a number: ");
           numbersIn[i]=sc.nextInt();
           System.out.print("");
       }
        for(int i =0;i<numbersIn.length;i++)
       {
           if(numbersIn[i]<5)
           {
              System.out.println(numbersIn[i]+" is less than 5");  
            }
           
       }
    }

    
}

