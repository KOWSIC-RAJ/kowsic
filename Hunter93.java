package guvi;

import java.util.Scanner;

public class Hunter93 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int res[]=new int[10];
		int a=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>=65&&str.charAt(i)<=90){
				res[a++]=i;
			}			
		}
		str=str.toLowerCase();
		String x="";
		String sp[]=str.split(" ");
		for(int i=0;i<sp.length;i++){
			StringBuffer sb=new StringBuffer(sp[i]).reverse();
			String sx=sb.toString();
			x=x+sx+" ";					
		}
	String s2="";
	int k=0;
		for(int i=0;i<x.length();i++){
			if(i==res[k]){
				char c=0;
				c=Character.toUpperCase(x.charAt(i));
				s2=s2+c;
				k++;
			}
			else{
				s2=s2+x.charAt(i);
			}
		}
		System.out.println(s2);
 }
	
}
