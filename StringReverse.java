package guvi;

import java.util.Scanner;

public class StringReverse {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.next();
		String str1= new StringBuffer(str).reverse().toString();
        System.out.println("The reverse of the string is : "+str1);
	}
}
