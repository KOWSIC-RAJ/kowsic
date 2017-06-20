package guvi;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = s.next();
		String s2= new StringBuffer(s1).reverse().toString();
		if(s1.equals(s2)){
			System.out.println(" String is a palindrome ");
		}
		else
		{
			System.out.println(" String is not a palindrome ");
		}
		}

}



