

import java.util.*;

class linersearch
{
public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value in Array : ");
		//int a=scan.nextInt();

		int[] array = new int[6];
		for (int i =0 ; i<5;i++ )
			{
				array[i]= scan.nextInt();
			}
	/* for(int j= 0; j<5; j++  )
	{
		System.out.println(array[j]);
	}*/
	System.out.println("Enter a Value to search : ");
	int flag = 0;
	int k = scan.nextInt();
	
	System.out.println(" Result:-");
	for (int l =0 ; l<5 ; l++)
		{
			if(array[l]==k)
			{
				int r = l+1;
				System.out.println("The number "+k+" is exist in Array at Place "+r);
				flag = 1;
				break;
			}
			else
			{
				flag=0;
			}
		}
	if (flag==0)
		{
			System.out.print("The number "+k +" does not exist in Array");
		}
	}
}
