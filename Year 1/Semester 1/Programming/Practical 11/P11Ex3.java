
import java.util.Scanner;
public class P11Ex3
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int f[]=new int[5] ;
		
		acceptArray(f);
		
		
		printArray(f);   // Call up procedure printArray() and pass in array f[]
		System.out.println();
		
	}
	
public static void acceptArray(int [] ar)
	{
		Scanner sc=new Scanner(System.in);
	    for(int i=0; i<ar.length;i++)
		{
		   System.out.print("Enter value: "); 
		   ar[i]=sc.nextInt();
		   System.out.println();
		}
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
