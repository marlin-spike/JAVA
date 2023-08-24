package DSA;

import java.util.Scanner;

public class reverse_a_sentance
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);        
        System.out.println("Enter the input: ");
        String Val = scan.nextLine();
        
        String output= rev(Val);
        
        System.out.println("Output is :: " +output);
        scan.close();
    }

    public static String rev(String str)
    {
        StringBuilder res = new StringBuilder();
        String word[] = str.split(" ");
        int i, n = word.length;

        
        for(i = n-1; i>=0;i--)
        {
            res.append(word[i]);
            if(i != 0){
            res.append(".");
            }
            }
            return res.toString();

    }
}