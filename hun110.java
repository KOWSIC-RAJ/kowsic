package guvi;

import java.util.Scanner;

public class hun110 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		//input should be greater than 3 inorder to find the sum.
	    int n=s.nextInt();
	    int i=0;
	    int j=0;
	    int x=(n/2);
	    int arr[][]=new int[n][n];
	    for(i=0;i<n;i++){
	    	for(j=0;j<n;j++){
	    		arr[i][j]=s.nextInt();
	    	}
	    }
	    int sum=0;
	    for(i=x-1;i<=arr[i].length-x;i++){
	    	for(j=x-1;j<=arr[j].length-x;j++){
	    		sum+=arr[i][j];
	    	}
	    }
	      System.out.println(sum);
	}
}
