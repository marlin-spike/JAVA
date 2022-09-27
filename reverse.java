import java.util.*;

class reverse 
{
public static void main  (String args[])
{
	int i , rev= 0;
	Scanner scan =new Scanner(System.in);
	
	System.out.print("Enter a String : ");
	int a = scan.nextInt();

	while(a != 0)
	{

	i = a % 10;
	rev = rev*10 + i;
	a = a / 10;
	
	}
System.out.println("the reverse is " + rev);
}
}
