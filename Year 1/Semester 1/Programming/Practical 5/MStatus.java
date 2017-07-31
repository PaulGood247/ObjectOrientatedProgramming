import java.util.*;
public class MStatus
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        
        String name;
        char relationshipStatus;
        
        System.out.println("***** Marital Status*****");
        System.out.println("");
        System.out.println("    Single (S, s)");
        System.out.println("    Married (M, m)");
        System.out.println("    Divorced (D, d) ");
        System.out.println("    In a Relationship (R, r)");
        System.out.print("Please enter your name: ");
        name= sc.next();
        System.out.print("Please enter your Relatioship Status: ");
        relationshipStatus=sc.next().charAt(0);
        
        
    
    
            switch(relationshipStatus)
        {
            case 'S' : case 's': System.out.println("Hi " + name + ", you are Single");
                break;
            case 'M' : case 'm': System.out.println("Hi " + name + ", you are Married");
                break;
            case 'D' : case 'd': System.out.println("Hi " + name + ", you are Divorced");
                break;
            case 'R' : case 'r': System.out.println("Hi " + name + ", you are in a Relationship");
                break;
	

            default: 	System.out.print("Error");
                        
                break;
	   } 
}
}

