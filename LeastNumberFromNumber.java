package guvi;

import java.util.Scanner;

public class LeastNumberFromNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int n;
		int i=0;
		int j=0;
	    int arr[]=new int[10];
	    while(number>0){
	    	n=number%10;
	    	arr[i]=n;
	    	i++;
	    	number/=10;
	    }
	    int x=i;
	    int temp=0;
	    for(i=0;i<x;i++){
	    	for(j=i+1;j<x;j++){
	    	if(arr[i]>arr[j]){
	    		temp=arr[i];
	    		arr[i]=arr[j];
	    		arr[j]=temp;
	    	}
	    }
	    }
	    int k=s.nextInt();
	    for(i=0;i<x-k;i++){
	    	System.out.print(arr[i]);
	    }
	}

}
