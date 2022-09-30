import java.util.*;

class loop
{
public static void main (String args[])
	{
		Scanner sn = new Scanner(System.in);
		
		System.out.print("  Enter a Number : ");
			int no = sn.nextInt();

		System.out.print("  "+no+" to the power : ");
			int po = sn.nextInt();
		
		int con = 1;
		
		//calculating Power using For loop
		
		for(int i = 0 ; i<po ; i++)
			{
				con = con * no;
			}
		System.out.print("  "+no + " to the power " +po + " IS : " + con +" \n\n");
	
	//Printing a All Alphabet Using While Loop
		char alp = 'A';
		while( alp <= 'Z')
		{
			System.out.print(alp +" ");
			alp++;
		}

System.out.print("\n\n");
	//Printing Small Alphabet usnig DO-WHILE loop
	
		char small = 'a';
		do
		{
			System.out.print(small +" ");
			small++;
		}while(small <='z');

	}
}
