import java.util.*;

class Avragofnumber
{
public static void main(String args[])
	{
		Scanner sn = new Scanner(System.in);
		
		System.out.print("How many number you want to enter : ");
		int no = sn.nextInt();

		System.out.print("Enter a Number in array : \n");
		int[] array = new int[no];

		int sum = 0;

		for(int i=0; i <no ; i++)
			{
				
				array[i] = sn.nextInt(); 
				sum = array[i] + sum;
			}

		int avg = sum/no;
		System.out.print("  The Avgrag of a given nubers is : " + avg);
		
	}
}
