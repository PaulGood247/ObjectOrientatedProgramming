
import java.util.Scanner;
public class P11Ex2
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int f[]=new int[5] ;
		
		for(int i=0; i<f.length;i++)
		{
		   System.out.print("Enter value: "); 
		   f[i]=sc.nextInt();
		   System.out.println();
		}
		
		printArray(f);   // Call up procedure printArray() and pass in array f[]
		System.out.println();
		
	}

public static void printArray(int [] ar)
	{
		int i;
		for( i = 0; i < ar.length; i = i + 1)
		{
			System.out.println(ar[i]);
		}
	}

}