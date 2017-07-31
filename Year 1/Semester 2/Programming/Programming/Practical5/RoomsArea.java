public class RoomsArea
{
    public static void main(String[]args)
    {
        
        Rectangle room1=new Rectangle();
        Rectangle room2=new Rectangle();
        Rectangle room3=new Rectangle();
        
        
        System.out.print("What is the kitchen's length? ");
        room1.setLength(EasyScanner.nextInt());
        System.out.print("What is the kitchen's width? ");
        room1.setWidth(EasyScanner.nextInt());
        
        System.out.println("");
        
        System.out.print("What is the bedroom's length? ");
        room2.setLength(EasyScanner.nextInt());
        System.out.print("What is the bedroom's width? ");
        room2.setWidth(EasyScanner.nextInt());
        
        System.out.println("");
        
        System.out.print("What is the den's length? ");
        room3.setLength(EasyScanner.nextInt());
        System.out.print("What is the den's width? ");
        room3.setWidth(EasyScanner.nextInt());
        
        System.out.println("");
        
        System.out.println("Room Areas");
        System.out.println("The area of the kitchen is "+room1.area());
        System.out.println("The area of the bedroom is "+room2.area());
        System.out.println("The area of the den is "+room3.area());
        System.out.println("The total area of all the rooms is "+((room1.area()+room2.area())+room3.area()));
        
        
    }
}
