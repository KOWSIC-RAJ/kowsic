package guvi;

import java.util.Scanner;

public class StringSubstringIndex {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	StringSubstringIndex a=new StringSubstringIndex();
	String str1=s.next();
	String str2=s.next();
	System.out.println(a.get(str1, str2));
}
	int get(String str1,String str2){	
	int len=str2.length();
	for(int i=0;i<str1.length()-len;i++){
		if(str1.substring(i,i+len).equals(str2)){
			return i;
		}
	}
	return -1;
	
}
}

