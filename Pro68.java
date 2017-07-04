package guvi;

import java.util.Scanner;

public class Pro68 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		int l1=str1.length();
		int l2=str2.length();
		String pin=s.next();
		int n=s.nextInt();
		String smaller="";
		String longer="";
		if(l1>l2){
			longer=str1;
			smaller=str2;
		}else if(l1<l2){
			longer=str2;
			smaller=str1;
		}else if(l1==l2){
			if(str1.charAt(0)>str2.charAt(0)){
				smaller=str1;
				longer=str2;
			}
			else
			{
				smaller=str2;
				longer=str1;
			}			
		}
		String userID=longer.charAt(0)+smaller+pin.charAt(n-1)+pin.charAt(pin.length()-n);
		char[] ch=userID.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>='a'&&ch[i]<='z') {   
			    ch[i]=(char) (ch[i]-32);
			} else if(ch[i]>='A'&&ch[i]<='Z'){   
			    ch[i]=(char) (ch[i]+32);
			}
		}
		userID = new String(ch);
		System.out.println(userID);
		
	}
}
