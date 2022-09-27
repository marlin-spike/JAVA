import java.util.*;

class Fibonacci
{
public static void main (String args[])
{
	long no, fno=0 , sno= 1, tno, b , i;
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter a number : ");
	no = scan.nextInt();

	for(i = 0; i<=no; i++)
	{
		System.out.print(fno + " ");
		tno = fno+sno;
		fno = sno;
		sno = tno;

	}
}



}
