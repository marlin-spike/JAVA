import java.util.*;

class Conditional
{
public static void main(String args[])
	{	
		int m1 ,m2 , m3 ;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("mark of M1 : ");
		m1 = scan.nextInt();
		System.out.print("mark of M2 : ");
		m2 = scan.nextInt();
		System.out.print("mark of M3 : ");
		m3 = scan.nextInt();

		float per , lo = m1+m2+m3;
			per = lo/300 * 100;

		System.out.println("\n\n  <<< Conditional Statements >>> \n\n");

		if(per > 35)
		{
			System.out.print("The person is Pass with " + per + "%");
			
			if(per < 50)
			{
				System.out.print(" but he have to study harder ...... ");
			}
			
			else if (per < 75)
			{
				System.out.print(", He is better but not Good ...... ");
			}
			else
			{
				System.out.print(" And He is Best ......");
			}
		}

		else
		{
			System.out.print("He Fail with "+per+ "%"+" ...");
		}

		scan.close();
	}
}
