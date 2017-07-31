import java.util.*;
public class P6Ex1
{
  public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter a number ");
        num=sc.nextInt();
        System.out.print("");
        int i =0;
        
        if(num>0)
        {
           while(i <=num) 
           {
               
               System.out.println(i);
               i++;
           }
        }
        if(num<0)
        {
           while (i >=num)
           {
              
               System.out.println(i);
                i--;
           }
        }
    }
}
