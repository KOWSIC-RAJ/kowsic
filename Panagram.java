package guvi;

import java.util.Scanner;

public class Panagram {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	String st=s.nextLine();
	int count=0;
	String str=removeSpace(st);
	if(str.length()!=26){
		System.out.println("Not a Panagram");
	}
	else
	{
		for(int i=0;i<str.length();i++){
		if((str.charAt(i)>=65&&str.charAt(i)<=90)||((str.charAt(i)>=97&&str.charAt(i)<=122))){
	       count++;		
		}		
		}
		if(count==26){
			System.out.println("Panagram");
		}
		else
		{
			System.out.println("Not a Panagram");
		}
	}
	
	}

	private static String removeSpace(String st) {
		char ch[]=st.toCharArray();
		String x="";
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=' '){
				x=x+ch[i];
			}
		}
		int i,j;
		String se="";
		int n=x.length();
		char[] cha=x.toCharArray();
		for(int  k=0;k<n;k++){
			for(j=k+1;j<n;j++){
				if(cha[k]==cha[j]){
					cha[j]='\0';
			}
		}
		}
		for(i=0;i<n;i++){
			if(cha[i]!='\0'){
				se=se+cha[i];
			}
		}
		return se;
	}
}
