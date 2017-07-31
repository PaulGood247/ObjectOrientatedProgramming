import java.util.*;
public class StudentSystem
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
        char choice;//variable for menu
        int counter1=0;
        
        String name="Empty";//Variable for choice 1
        int num=0, ProgGrade , WebDevGrade , MathGrade , CritThinkingGrade , OSGrade , CompArchGrade; //Variables for choice 1
        ProgGrade=0;  
        WebDevGrade=0;
        MathGrade=0;
        CritThinkingGrade=0; 
        OSGrade=0;  
        CompArchGrade=0;
        
        int module=0;
        
        int passed=0,failed=0,credits=0,GPA=0, total=0 , highestGrade=0 , lowestGrade=0;//Variable for choice 3
        String GPAStatus="Empty", Award;//Variable for choice 3
        
     do
     {
           
          
        System.out.println("Student Grade System");
        System.out.println("--------------------");
        System.out.println("");
        System.out.println("    1) Enter student details");
        System.out.println("    2) Display student grades");
        System.out.println("    3) Display student statistics");
        System.out.println("    4) Display full transcript");
        System.out.println("    0) Exit system ");
        System.out.println("");
        System.out.print("Select an option [0-4] >> ");
        choice = sc.next().charAt(0);
        if (choice != '1' && choice != '2' && choice != '3' && choice != '4' && choice != '0')
        {
            System.out.print("Invalid, Please re=enter [0-4]: ");
            choice = sc.next().charAt(0);
        }
            
        
        
        
        
           
              
                
              switch(choice)
              {
              case '1':
              
              System.out.println(" ");
              System.out.println("Entering Student Details");
              System.out.println("------------------------");
              
              System.out.print("Student name:                ");
              name= sc.next();
              System.out.print("Student number:              ");
              num= sc.nextInt();
              
              
              System.out.print("Programming Grade:           ");
              ProgGrade= sc.nextInt();
              while(ProgGrade<0 || ProgGrade>100)
              {
                  System.out.print("Please enter a valid Programming Grade: ");
                  ProgGrade= sc.nextInt();
              }
              if(ProgGrade>=40)
              {
                passed++; 
                credits=credits=5;
              }
              else
              {
                 failed++ ;
              }
              
              
              
              System.out.print("Web Development Grade:       ");
              WebDevGrade= sc.nextInt();
              while(WebDevGrade<0 || WebDevGrade>100)
              {
                  System.out.print("Please enter a valid Web Development Grade: ");
                  WebDevGrade= sc.nextInt();
              }
              if(WebDevGrade>=40)
              {
                passed++; 
                credits=credits+5;
              }
              else
              {
                 failed++ ;
              }
              
              
              
              
              System.out.print("Mathematics Grade:           ");
              MathGrade= sc.nextInt();
              while(MathGrade<0 || MathGrade>100)
              {
                  System.out.print("Please enter a valid Mathematics Grade: ");
                  MathGrade= sc.nextInt();
              }
              if(MathGrade>=40)
              {
                passed++; 
                credits=credits+5;
              }
              else
              {
                 failed++ ;
              }
              
              
              System.out.print("Critical Thinking Grade:     ");
              CritThinkingGrade= sc.nextInt();
              while(CritThinkingGrade<0 || CritThinkingGrade>100)
              {
                  System.out.print("Please enter a valid Critical Thinking Grade: ");
                  CritThinkingGrade= sc.nextInt();
              }
              if(CritThinkingGrade>=40)
              {
                passed++; 
                credits=credits+5;
              }
              else
              {
                 failed++ ;
              }
              
              
              System.out.print("Operating Systems Grade:     ");
              OSGrade= sc.nextInt();
              while(OSGrade<0 || OSGrade>100)
              {
                  System.out.print("Please enter a valid Operating Systems Grade: ");
                  OSGrade= sc.nextInt();
              }
              if(OSGrade>=40)
              {
                passed++; 
                credits=credits+5;
              }
              else
              {
                 failed++ ;
              }
              
              
              System.out.print("Computer Architecture Grade: ");
              CompArchGrade= sc.nextInt();
              while(CompArchGrade<0 || CompArchGrade>100)
              {
                  System.out.print("Please enter a valid Computer Architecture Grade: ");
                  CompArchGrade= sc.nextInt();
              }
              if(CompArchGrade>=40)
              {
                passed++; 
                credits=credits+5;
              }
              else
              {
                 failed++ ;
              }

              counter1++;
              System.out.println("");
              
              total=ProgGrade+WebDevGrade+MathGrade+CritThinkingGrade+OSGrade+CompArchGrade;
              
              if(ProgGrade>WebDevGrade&&ProgGrade>MathGrade&&ProgGrade>CritThinkingGrade&&ProgGrade>OSGrade&&ProgGrade>CompArchGrade)
              {
                  highestGrade=ProgGrade;
              }
              if(WebDevGrade>ProgGrade&&WebDevGrade>MathGrade&&WebDevGrade>CritThinkingGrade&&WebDevGrade>OSGrade&&WebDevGrade>CompArchGrade)
              {
                  highestGrade=WebDevGrade;
              }
              if(MathGrade>ProgGrade&&MathGrade>WebDevGrade&&MathGrade>CritThinkingGrade&&MathGrade>OSGrade&&MathGrade>CompArchGrade)
              {
                  highestGrade=MathGrade;
              }
              if(CritThinkingGrade>ProgGrade&&CritThinkingGrade>WebDevGrade&&CritThinkingGrade>MathGrade&&CritThinkingGrade>OSGrade&&CritThinkingGrade>CompArchGrade)
              {
                  highestGrade=CritThinkingGrade;
              }
               if(OSGrade>ProgGrade&&OSGrade>WebDevGrade&&OSGrade>MathGrade&&OSGrade>CritThinkingGrade&&OSGrade>CompArchGrade)
              {
                  highestGrade=OSGrade;
              }
               if(CompArchGrade>ProgGrade&&CompArchGrade>WebDevGrade&&CompArchGrade>MathGrade&&CompArchGrade>CritThinkingGrade&&CompArchGrade>OSGrade)
              {
                  highestGrade=CompArchGrade;
              }
              
              
              
              
              
              
              if(ProgGrade<WebDevGrade&&ProgGrade<MathGrade&&ProgGrade<CritThinkingGrade&&ProgGrade<OSGrade&&ProgGrade<CompArchGrade)
              {
                  lowestGrade=ProgGrade;
              }
              if(WebDevGrade<ProgGrade&&WebDevGrade<MathGrade&&WebDevGrade<CritThinkingGrade&&WebDevGrade<OSGrade&&WebDevGrade<CompArchGrade)
              {
                  lowestGrade=WebDevGrade;
              }
              if(MathGrade<ProgGrade&&MathGrade<WebDevGrade&&MathGrade<CritThinkingGrade&&MathGrade<OSGrade&&MathGrade<CompArchGrade)
              {
                  lowestGrade=MathGrade;
              }
              if(CritThinkingGrade<ProgGrade&&CritThinkingGrade<WebDevGrade&&CritThinkingGrade<MathGrade&&CritThinkingGrade<OSGrade&&CritThinkingGrade<CompArchGrade)
              {
                  lowestGrade=CritThinkingGrade;
              }
               if(OSGrade<ProgGrade&&OSGrade<WebDevGrade&&OSGrade<MathGrade&&OSGrade<CritThinkingGrade&&OSGrade<CompArchGrade)
              {
                  lowestGrade=OSGrade;
              }
               if(CompArchGrade<ProgGrade&&CompArchGrade<WebDevGrade&&CompArchGrade<MathGrade&&CompArchGrade<CritThinkingGrade&&CompArchGrade<OSGrade)
              {
                  lowestGrade=CompArchGrade;
              }
    
              
              break;
              
              
              case '2':
              if (counter1==0)
              {
                 System.out.print("No student details entered; please enter the student details via option 1: ");
                 choice = sc.next().charAt(0);
                 while(choice!='1')
                 {
                     System.out.print("No student details entered; please enter the student details via option 1: ");
                     choice = sc.next().charAt(0);
                 }
                 break;
              }
              
              
              System.out.println("Semester 1 results");
              System.out.println("------------------");
              System.out.println("    Programming:          "+ProgGrade);
              System.out.println("    Web Development:      "+WebDevGrade);
              System.out.println("    Mathematics:          "+MathGrade);
              System.out.println("    Critical Thinking:    "+CritThinkingGrade);
              System.out.println("    Operating Systems:    "+OSGrade);
              System.out.println("    Computer Architecture:"+CompArchGrade);
              System.out.println("");
            
              break;
              
              
              
              
              case '3':
              if (counter1==0)
              {
                 System.out.print("No student details entered; please enter the student details via option 1: ");
                 choice = sc.next().charAt(0);
                 while(choice!='1')
                 {
                     System.out.print("No student details entered; please enter the student details via option 1: ");
                     choice = sc.next().charAt(0);
                 }
                 break;
              }
              
              
              GPA=total/6;
              
              if(GPA<40)
              {
                  GPAStatus="Fail";
              }
              else if(GPA>=40 && GPA<=49)
              {
                  GPAStatus="Pass";
              }
              else if(GPA>=50 && GPA<=59)
              {
                  GPAStatus="2.2 Honours";
              }
              else if(GPA>=60 && GPA<=69)
              {
                  GPAStatus="2.1 Honours";
              }
              else if(GPA>=70 && GPA <=100)
              {
                  GPAStatus="1st class Honours";
              }
                  
              System.out.println("   Number of passed modules:  " +passed);
              System.out.println("   Number of failed modules:  " +failed);
              System.out.println("   Highest Grade:             " +highestGrade);
              System.out.println("   Lowest Grade:              " +lowestGrade);
              System.out.println("   Credits achieved (max 30): " +credits);   
              System.out.println("   Your GPA is:               " +GPA );
              System.out.println("   Your award is:             " +GPAStatus);
              
               
              break;
              
              
              
              case '4':
              
              System.out.println("=========================================================================================");
              System.out.println("                                      Waterford Institute of Technology,");
              System.out.println("                                       Cork Road,");
              System.out.println("                                        Waterford.");
              System.out.println("");
              System.out.println("                                      t: (051) 302000");
              System.out.println("                                      w: www.wit.ie");
              System.out.println("                                      e: info@wit.ie");
              System.out.println("");
              System.out.println("  Student (number): "+name+"("+num+")");
              System.out.println("");
              System.out.println("  Semester 1 results");
              System.out.println("  ~~~~~~~~~~~~~~~~~~");
              System.out.println("      Programming:            "+ProgGrade);
              System.out.println("      Web Development:        "+WebDevGrade);
              System.out.println("      Mathematics:            "+MathGrade);
              System.out.println("      Critical Thinking:      "+CritThinkingGrade);
              System.out.println("      Operating Systems:      "+OSGrade);
              System.out.println("      Computer Architecture   "+CompArchGrade);
              System.out.println("");
              System.out.println("  Semester 1 statistics");
              System.out.println("  ~~~~~~~~~~~~~~~~~~~~~");
              System.out.println("      Number of passed modules:   "+passed);
              System.out.println("      Number of failed modules:   "+failed);
              System.out.println("      Highest grade:              "+highestGrade);
              System.out.println("      Lowest grade:               "+lowestGrade);
              System.out.println("      Credits achieved (max 30):  "+credits);
              System.out.println("      Your GPA is:                "+GPA);
              System.out.println("      Your award is:              "+GPAStatus);
              System.out.println("");
              System.out.println("=========================================================================================");
              System.out.println("");
              
              
              
              
              
              
              
              
              break;
            
              
            }
    }while (choice != '0');
        
    

    System.out.println("Thank you for using the system");

}
}
