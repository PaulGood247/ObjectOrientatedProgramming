import java.util.*;
public class CdSystem
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        
        
        int numCd;
        char choice;
        System.out.print("How many songs are on the CD: ");
        numCd=sc.nextInt();
        
        String[] songNames=new String[numCd];
        int[] songLength=new int[numCd];
        
        System.out.println("");
        
        do{
            System.out.println("*********** MENU **********");
            System.out.println("1. Enter CD names");
            System.out.println("2. Enter length of each song on the CD(in seconds)");
            System.out.println("3. Display all song details (name and length)");
            System.out.println("4. Display the details of the longest song");
            System.out.println("5. Display the name of the shortest song");
            System.out.println("6. Calculate and display");
            System.out.println("7. Exit system");
            System.out.println("");
            System.out.print("Please enter an option: ");
            choice=sc.next().charAt(0);
            System.out.println("");
            System.out.println("");
            System.out.println("");
            
         switch(choice)
         {
            case '1': 
                      songNameMethod(songNames);
                      System.out.println("");
                      break;
            
            
            case '2': 
                      songLengthMethod(songLength);
                      System.out.println("");
                      break;
                      
                      
            case '3': displayDetails(songNames,songLength);
            
            case '4':
            
            case '5':
            
            case '6':
            
            
            
         }
        }while(choice!=7);
        
        
        
        
    }
    
    private static void songNameMethod(String[] songNamesIn)
    {
        Scanner sc=new Scanner(System.in);
        for(int i =0; i<songNamesIn.length;i++)
        {
            System.out.print("Enter name of song "+(i+1)+": ");
            songNamesIn[i]=sc.nextLine();
        }
        
        
    }
    
    private static void songLengthMethod(int[] songLengthIn)
    {
        Scanner sc=new Scanner(System.in);
        for(int i =0; i<songLengthIn.length;i++)
        {
            System.out.print("Enter the length of song "+(i+1)+": ");
            songLengthIn[i]=sc.nextInt();
        }
        
        
    }
    
    private static void displayDetails(String [] songNamesIn ,int[] songLengthIn)
    {
        
        for(int i =0; i<songLengthIn.length;i++)
        {
            System.out.println("Name: "+ songNamesIn[i]            +"Length: "+ songLengthIn[i]);
            
        }
        
        
    }
}
