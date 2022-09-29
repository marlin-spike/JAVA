import java.util.*;

class anoReverseString
{
public static void main(String args[])
	{
		Scanner sn = new Scanner(System.in);
		
		System.out.print(" Enter a String : ");
		String str = sn.nextLine();

		String rev = "";
		char ch;
		int i, k = 0;	
		int l = str.length();
		for( i = 0; i < l ; i++)
			{
				ch = str.charAt(i);
				rev = ch + rev; //it add a letter on i-th position in rev
								//at 2nd time it add a i-th letter 
								// >>at	FRONT of letter present in REV 
			}
				System.out.print("\n The Reversed String is :- "+rev);
			
	}
}
