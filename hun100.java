package guvi;

import java.util.Scanner;

public class hun100 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 int num=122334;
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
		    	sum+=(int) Math.pow(arr[i], arr[i-1]);
		    	}
		    	else
		    	{
		    		sum+=(int) Math.pow(arr[i],0);
		    	}
		    }
		  System.out.println(sum);	
		}
}
