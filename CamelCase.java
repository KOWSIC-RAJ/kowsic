package guvi;

import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int count=0;
		int temp=0;
		if(str.charAt(0)>=65&&str.charAt(0)<=91){
			count+=2;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)>=65&&str.charAt(i)<=91){
					temp++;
				}
			}
		}else{
			count+=1;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)>=65&&str.charAt(i)<=91){
					temp++;
				}			
		}		
	}
		if(count==temp){
			System.out.println(str+" is a camel case");
		}
		else
		{
			System.out.println(str+" is not a camel case");
		}		
	}
}
