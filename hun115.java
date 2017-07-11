package guvi;

import java.util.Scanner;

public class hun115 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		String str="";
		int l1=s1.length();
		int l2=s2.length();
		int a=1;
		if(l1<l2){
			for(int i=0;i<l2;i++){
				if(i<l1){
					str+=s1.charAt(i);
					str+=s2.charAt(i);				
				}
				else
				{
					str+=(a++);
					str+=s2.charAt(i);
				}
			}
		}
	  else
		{
			for(int i=0;i<l1;i++){
				if(i<l2){
					str+=s1.charAt(i);
					str+=s2.charAt(i);				
				}
				else
				{
					str+=s1.charAt(i);
					str+=(a++);
				}
			
		}
		System.out.println(str);

		}
		
	}
}


