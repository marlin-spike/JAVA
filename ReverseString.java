import java.util.*;

class ReverseString
{
public static void main(String args[])
	{
		Scanner sn = new Scanner(System.in);
		
		String str = sn.nextLine();

		String rev = "";
		char ch;
		
		int i, k = 0;	
		int l = str.length() - 1;
		
		for( i = l; i >= 0 ; i--)
			{
				ch = str.charAt(i);
				rev = rev + ch;
			}
		
		System.out.print(rev);
			
	}
}
