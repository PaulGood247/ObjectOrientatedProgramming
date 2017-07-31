
import java.util.Scanner;
public class P11Ex1
{
	
	public static void main(String args[])
	{
		
		int f[] = {2, 3, 4, 5, 6};
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