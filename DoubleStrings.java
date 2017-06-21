package guvi;

import java.util.Scanner;

public class DoubleStrings {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
	String str=s.next();
	int len=str.length();
	if(str.substring(0,len/2).equals(str.substring(len/2,len))){
	System.out.println("String is double String");
	}
	else
	{
		System.out.println("String is not a double string");
		
	}
	}
}
