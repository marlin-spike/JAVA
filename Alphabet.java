import java.util.*;

class Alphabet
{
	public static void main (String args[])
		{
			Scanner scan = new Scanner(System.in);
				
				System.out.print("Enter a Charactor : ");

			char A = scan.next().charAt(0);

			if (A=='a' || A== 'e' || A=='i' || A =='o' || A=='u')
			{
				System.out.print("\n"+A +" is  Vowels ");
			}
			else 
			{
				System.out.print("\n" +A+ " is a Consonant");
			}
	
		}
}

