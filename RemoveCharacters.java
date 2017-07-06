package guvi;

import java.util.Scanner;

public class RemoveCharacters {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char ch[]=str.toCharArray();
		String se=""; 
		int i=0;
		int j=0;
		int a=0;
		int count=0;
		for(i=0;i<ch.length;i++){
			count=0;
			for(j=0;j<ch.length;j++){
				if(ch[i]==ch[j]){
					count++;
				}
			}
			if(count==1){
				se+=ch[i];
			}
			a++;
		}
		System.out.println(se);
	}

}
