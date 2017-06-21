package guvi;

import java.util.Scanner;

public class PalindromeNumbers {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int num,rev=0;
		while(n>0){
			num=n%10;
			rev=num+(rev*10);
			n=n/10;
			
		}
		if(temp==rev)
		System.out.println("The given number is a palindrome ");
		else
			System.out.println("The given number is not a palindrome");
	
	}
}
