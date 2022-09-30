import java.util.*;

class Overloading
{
public static void main (String args[])
	{
		Constructor C1 = new Constructor();
		
		System.out.println("\n\n  And This is an Overloaded Constructor \n");
		Constructor C2 = new Constructor("Shreyash ", 22);
		C2.printdata();

		C2.method("Yash", 20);
			System.out.println("\n This is an Overloaded Method...");
		C2.method("Tushar", 21, "CSE");
	}
}

class Constructor
{
	String m;
	int n;
	Constructor(String a, int b)
	{
		m = a;
		n = b;
	}

	Constructor()
	{
		System.out.println("  This is a Default Constructor");
	}

	void printdata()
	{
		System.out.println("  Name : " + m);
		System.out.println("  Age : " + n+"\n");
	}
	
	void method(String S, int a)
	{
		System.out.println("Name : " + S);
		System.out.println("Age : " + a);
	}

	void method(String S ,int a ,String b)
	{
		System.out.println("Name : " + S);
		System.out.println("Age : " + a);
		System.out.println("Branch : " + b);
	}

}

