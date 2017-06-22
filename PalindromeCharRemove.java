package guvi;

import java.util.Scanner;

public class PalindromeCharRemove {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str=s.next();
		char ch[]=str.toCharArray();
		int len=str.length();
		int count=0;
		int i=0,j=len;
		int n=len/2;
		for(i=0,j=len-1;i<n;i++,j--){
			if(ch[i]!=ch[j]){
				count++;
			}
			if(count==1){
				break;
			}
		}
		System.out.println(ch[j]+" at index "+j+" should be replaced to get palindrome");
	}

}
