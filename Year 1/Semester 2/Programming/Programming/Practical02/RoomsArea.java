import java.util.*;
public class RoomsArea
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in); 
      
      double Length;
      double Width;
      double total;
      
      System.out.print("What is the kitchen's length? ");
      Length=sc.nextDouble();
      
      System.out.print("What is the kitchen's width? ");
      Width=sc.nextDouble();
      
      Rectangle kitchen=new Rectangle(Length, Width);
       
      System.out.println("");
      
      System.out.print("What is the bedroom's length? ");
      Length=sc.nextDouble();
      
      System.out.print("What is the bedroom's width? ");
      Width=sc.nextDouble();
      
      Rectangle bedroom=new Rectangle(Length, Width);
      
      System.out.println("");
      
      System.out.print("What is the den's length? ");
      Length=sc.nextDouble();
      
      System.out.print("What is the den's width? ");
      Width=sc.nextDouble();
      
      Rectangle den=new Rectangle(Length, Width);
      
      System.out.println("");
      
      System.out.println("Room Areas");
      System.out.println("The area of the kitchen is "+ kitchen.calculateArea());
      System.out.println("The area of the bedroom is "+ bedroom.calculateArea());
      System.out.println("The area of the den is "+ den.calculateArea());
      total=kitchen.calculateArea()+ bedroom.calculateArea()+ den.calculateArea();
      System.out.println("The total area of all the rooms is "+ total);
      
       
   }
}
