package guvi;

import java.util.Scanner;

public class SmallestPalindrome {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
	    String str=s.next();
	    int temp=9999;
	    String pal="";
	    StringBuffer st=new StringBuffer(str);
	    for(int i=0;i<=st.length();i++){
	    	for(int j=i+1;j<=st.length();j++){
	    		StringBuffer sb=new StringBuffer(st.substring(i,j));
	    		String a=st.substring(i,j);
	    		String b=sb.reverse().toString();	    
	    		if(a.equals(b)&&a.length()>1){
	    			int min=a.length();
	    			if(min<temp){
	    				temp=min;
	    				pal=a;
	    			}
	    		} 		
	    	}
	    }
        System.out.println(pal);
	    }
}