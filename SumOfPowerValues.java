package guvi;

import java.util.Scanner;

public class SumOfPowerValues {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int temp=n;
	    int sum=0;
	    int rems=1;
	    int a=4;
	    while(n>0){	
	    	int rem=0;
	    	rems=1;
	    	rem=n%10;
	    	for(int i=1;i<=4;i++){
	    		rems*=rem;
	    	}
	    	sum+=rems;
	    	n/=10;	    	
	    }
	    System.out.println(sum);	
	}
}
