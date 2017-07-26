package guvi;

import java.util.Scanner;

public class player3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int rev=0;
		int n=s.nextInt();
		while(n>0){
			rev=(rev*10)+n%10;
		     n/=10;
		}
		System.out.println(rev);
	}

}
