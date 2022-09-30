import java.util.*;

class Prime
{
public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no, re, flag = 0;
		System.out.print("Enter a no : ");
		no = sc.nextInt();

		for(int i = 2; i <= no ; i++)
		{
			for(int r = 2; r < i; r++)
			{
				flag = 1;
				
				 if(i%r== 0)
				{
					flag = 0;
					break;
				}
			}	
		
			if(flag == 1)
			{
				System.out.print(i + " ");
			}
			
		}
	}
}
