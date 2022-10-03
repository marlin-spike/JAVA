import java.util.*;

class swap 
{
public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//swap no
		System.out.print("Enter a no in Var A : ");
		int a = sc.nextInt();
		System.out.print("Enter a no in Var B : ");
		int b = sc.nextInt();	

		b = a+b;
		a = b-a;
		b = b-a;
		System.out.print("\n<<< SWAP >>> \n\n");

		System.out.println("Value in Var 'A' : "+a);
		System.out.println("Value in Var 'B' : "+b);
		
		
	}
}
