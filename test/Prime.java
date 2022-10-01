import java.util.*;

class Prime
{
public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no, re, flag ;
		System.out.print("Enter a no : ");
		no = sc.nextInt();
		
		for(int i = 2; i <= no ; i++)
		{
			flag = 1;
			
			for(int r = 2; r * r <= i; r++){	
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

   
