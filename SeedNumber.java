package guvi;

import java.util.Scanner;

public class SeedNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int result=num;
	while(num>0){
		result*=num%10;
		num/=10;		
	}
	System.out.println(result);	
	}
}
