package guvi;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int temp=n;
	    int sum=0;
	    while(temp>0){
	    	n=temp;
	    	while(n>0){
	    		sum+=n%10;
	    		n/=10;
	    	}
	    	temp/=10;
	    }
	    System.out.println(sum);
	}
}
