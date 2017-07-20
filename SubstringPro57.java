package guvi;

import java.util.Scanner;

public class SubstringPro57 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int i=0;
		int j=0;
		int temp=0;
		int count=0;
		for(i=0;i<s1.length()-1;i++){
			count=0;
			for(j=0;j<s2.length()-1;j++){
				if(s1.substring(i,i+2).equals(s2.substring(j,j+2))){
					count++;
				}
			}
			if(count>0)
			{
				System.out.println("True");
				temp=1;
				break;
			}
		}
		if(temp==0){
			System.out.println("False");
		}

	}

}
