import java.util.*;
public class P11Ex6
{
   public static void main(String[] args)
   {
       double [] temperature;
       temperature = enterTemps();
       displayTemps(temperature);
	
   }   

  public static double[] enterTemps()
  {
         Scanner sc = new Scanner(System.in);
         double [] temperatureOut = new double [7];
         for(int i = 0; i < temperatureOut.length; i = i + 1)
         {
                  System.out.print("Enter temperature for day: ");
                  temperatureOut[i] = sc.nextDouble();
                  System.out.println();
          }
          return temperatureOut;
        }

    public static void displayTemps(double [] printTemp)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Output of the array temperature[]: ");
        for(int i = 0; i < printTemp.length ; i = i + 1)
        {
            System.out.println(printTemp[i]);
        }
    }
}

