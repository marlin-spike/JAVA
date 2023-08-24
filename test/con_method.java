import java.util.*;

class con_method
{
public static void main (String args[])
	{
		Power p1 = new Power();
		Scanner sn = new Scanner(System.in);
		
		int f_no,s_no;
		System.out.print("Enter a number : ");
		f_no = sn.nextInt();

		System.out.print(f_no+" To the power : ");
		s_no = sn.nextInt();

		p1.GetData(f_no ,s_no);
		p1.powerOf();
		p1.printdata();
		sn.close();
		
	}
}

class Power
{
	int po = 1,A ,B ;

	void GetData(int a ,int b)
	{
		A = a;
		B = b;
	}

	void powerOf()
	{
		for(int i = 0 ; i<B ;i++ )
		{
			po = po *A;
		}
	}
	void printdata()
	{
		System.out.print(A + " To the Power "+B+" is : "+po);
	}

}
