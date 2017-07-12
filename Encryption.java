package guvi;

import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    String str=s.next();;
	    String st="";
	    for(int i=0;i<str.length();i++){
	    	int a=str.charAt(i)-1;
	    	if(i!=str.length()-1){
	    	if(a+1!=97){
	    	st+=(char)a;
	    	}
	    	else
	    	{
	    		st+='z';
	    	}
	    	}
	    	else
	    	{
	    		st+=str.charAt(i);
	    	}
	    }
	    System.out.println(st);	
	}
}
