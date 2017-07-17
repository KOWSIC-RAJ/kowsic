package guvi;

import java.util.Scanner;

public class pro126 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    int i=0;
	    int count=0;
	    for(i=0;i<n;i++){
	    	arr[i]=s.nextInt();
	    }
	    System.out.println("Enter the number that has to be counted");
	    int x=s.nextInt();
	    for(i=0;i<n;i++){
	    	if(x==arr[i]){
	    		count++;
	    	}
	    }
	    System.out.println("Number : "+x);
	    System.out.println("Count of the number : "+count);	
	}
}
