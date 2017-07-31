public class CircleDemo
{
    public static void main(String[]args)
    {
        
        Circle circle1=new Circle();
        Circle circle2=new Circle();
        
        System.out.print("Enter the radius of the first circle: ");
        circle1.setRadius(EasyScanner.nextInt());
        
        System.out.println("");
        
        System.out.print("Enter the radius of the second circle: ");
        circle2.setRadius(EasyScanner.nextInt());
        
        System.out.println("");

        System.out.println("  Circle One Geometric Information ");
        System.out.print("");
        System.out.print("The circle's area is "+circle1.area());
        System.out.print("The circle's diameter is "+circle1.diameter());
        
    }
}
