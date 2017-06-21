package guvi;

import java.util.Scanner;

public class Tallest {
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int i,j;
	int n=s.nextInt();
	int arr[]=new int[n];
	for(i=0;i<n;i++){
		arr[i]=s.nextInt();
	}
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(arr[i]<arr[j]){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("The Fourth tallest student in the class is :"+arr[3]);
	System.out.println("Enter the k value to find the kth tallest student");
	int k=s.nextInt();
	System.out.println(+arr[k-1]);

	}
}
