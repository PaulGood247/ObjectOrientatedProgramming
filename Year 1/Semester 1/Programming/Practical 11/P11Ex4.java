import java.util.*;
public class P11Ex4
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);   
       int[] ages = new int[3];
       int i;
       for( i = 0; i < ages.length; i = i + 1)
       {
        
           System.out.println("Please enter student age:");
           ages[i] = sc.nextInt();
       }
       averageAge(ages);   // Method Call
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