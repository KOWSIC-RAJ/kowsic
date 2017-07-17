package guvi;

import java.util.Scanner;

public class EncodeStrings {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String s1="code";
		String s2="kata";
		String st="";
		String str="";
		char ch;
		int i=0;
		for(i=0;i<s1.length();i++){
			int a=s1.charAt(i)+10;
			if(a<=122){
			ch=(char) (s1.charAt(i)+10);
			st+=ch;
			}
			else{
				int x=96+(a-122);
				ch=(char)x;
				st+=ch;
			}
		}
		for(i=0;i<s2.length();i++){
			if(i==0||i==s2.length()-1){
				str+=(char)s2.charAt(i);
			}else
			{
				int a=s2.charAt(i)+10;
				if(a<=122){
				ch=(char) (s2.charAt(i)+10);
				str+=ch;
				}
				else{
					int x=96+(a-122);
					ch=(char)x;
					str+=ch;
				}
			}
		}
		System.out.println(st+" "+str);		
	}

}
