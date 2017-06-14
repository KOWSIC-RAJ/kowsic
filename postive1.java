
package kowsicraj;
import java.util.Scanner;
public class postive1 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=s.nextInt();
		if(number==0)
			System.out.println("Zero");
		else if(number>0)
			System.out.println("Postive");
		else
			System.out.println("Negative");
	}

}
