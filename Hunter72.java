package guvi;

import java.util.Scanner;

public class Hunter72 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] words=str.split("\\s");
		for(int i=0;i<words.length;i++){
			if(i%2!=0)
	         	System.out.print(words[i]+" ");
			else{
				StringBuffer sb=new StringBuffer(words[i]);
				System.out.print(sb.reverse()+" ");				
			}
		}
	}  
}	


