public class CarDemo
{
    public static void main(String[]args)
    {
        
        Car car1=new Car();
        
        
        System.out.println("Current Status of the car: ");
        
        System.out.print("Year model: ");
        car1.setYear(EasyScanner.nextInt());
        System.out.print("Make: ");
        car1.setMake(EasyScanner.nextString());
        System.out.print("Speed: ");
        car1.setSpeed(EasyScanner.nextInt());
        
        System.out.print("");
        
        System.out.println("Accerlerating... ");
        car1.accelerate();
        car1.accelerate();
        car1.accelerate();
        car1.accelerate();
        car1.accelerate();
        System.out.println("Now the speed is "+car1.getSpeed());
        
        
        System.out.println("");
        
        System.out.println("Braking... ");
        car1.brake();
        car1.brake();
        car1.brake();
        car1.brake();
        System.out.println("Now the speed is "+car1.getSpeed());
    }
}
