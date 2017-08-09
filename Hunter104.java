package guvi;

import java.util.Scanner;

public class Hunter104 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		int len1=str1.length();
		int len2=str2.length();
		int max=0;
		int min=0;
		String x="";
		if(len1>len2){
			max=len1;
			min=len2;
			x=str1;
		}
		else
		{
			max=len2;
			min=len1;
			x=str2;
		}
		for(int i=0;i<max;i++){
			if(i<min){			
			System.out.println(str2.charAt(i)+""+str1.charAt(i));
			}
			else{
				System.out.println(x.charAt(i));
			}
		}	
	}

}
