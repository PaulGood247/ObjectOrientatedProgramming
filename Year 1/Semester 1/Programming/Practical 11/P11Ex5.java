import java.util.*;
public class P11Ex5
{
    public static void main(String args[])
    {
          
       int[] ages = new int[3];
       
      
       acceptAges(ages);
       
       
       averageAge(ages);   // Method Call
     }

     private static void acceptAges(int [] agesIn)
     {
       Scanner sc = new Scanner(System.in);
         for(int i= 0; i < agesIn.length; i = i + 1)
       {
        
           System.out.println("Please enter student age:");
           agesIn[i] = sc.nextInt();
       } 

     }

    // Method header for averageAge()
    public static void averageAge(int [] agesIn)
    {
        double total=0, average;
        for(int j = 0; j <agesIn.length; j = j + 1)
        {
            total = total + agesIn[j];
        }
        average = total / agesIn.length;
        System.out.println("The average age of students is:  " + average);
    }
}
