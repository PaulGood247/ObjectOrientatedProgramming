public class DateTest
{
    public static void main(String[]args)
    {
        
        Date today=new Date();
        Date tomorrow=new Date();
        
        today.setDay(10);
        today.setMonth(2);
        today.setYear(2008);
        
        
        System.out.print("Todays date is: ");
        today.theDate();
        System.out.println("");
        System.out.println("");
        System.out.print("What is tomorrows day: ");
        tomorrow.setDay(EasyScanner.nextInt());
        System.out.print("What is tomorrows month: ");
        tomorrow.setMonth(EasyScanner.nextInt());
        System.out.print("What is tomorrows year: ");
        tomorrow.setYear(EasyScanner.nextInt());
        
        System.out.println("");
        
        System.out.print("Tomorrows date is: ");
        tomorrow.theDate();
    }
}