import java.util.*;

class even
{
   public static void main (String args[])
      {
  
		  Scanner scan = new Scanner(System.in);

		  System.out.print("Enter a number:  ");
		  int a = scan.nextInt();

		  int b = a % 2;
		
		  if (b==0)
		  {
			  System.out.println(a + " is a Even number ");
		  }
		  else
		  {
			System.out.println(a + " is ODD number");
		  }






	  }



}
