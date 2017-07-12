package guvi;

import java.util.Scanner;

public class hun105 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int num=s.nextInt();;
	    int i=0;
	    int arr[]=new int[10];
	    while(num>0){
	    	arr[i++]=num%10;
	    	num/=10;
	    }
	    int sum=0;
	    int temp=i;
	    for(i=i-1;i>=0;i--){
	    	if(i!=0){
	    	sum+=Math.pow(arr[i], arr[i-1]);
	    	}
	    	else
	    	{
	    		sum+=Math.pow(arr[i],arr[temp-1]);
	    	}
	    }
	System.out.println(sum);	
	}
}
