import java.util.*;

class swap_string
{
public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//swap String
		System.out.print("Enter a no in String A : ");
		String a = sc.nextLine();
		System.out.print("Enter a no in String B : ");
		String b = sc.nextLine();	
		String temp;

		temp = a;
		a = b;
		b = temp;
		temp = null;
		System.out.print("\n<<< SWAP >>> \n\n");

		System.out.println("Value in String 'A' : "+a);
		System.out.println("Value in String 'B' : "+b);
		
		
	}
}
