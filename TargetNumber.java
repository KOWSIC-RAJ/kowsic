package guvi;

import java.util.Scanner;

public class TargetNumber {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i,j,count=0;
	int arr[]=new int[n];
	System.out.println("Enter the array elements");
	for(i=0;i<n;i++){
		arr[i]=s.nextInt();
		}
	System.out.println("Enter the target number");
	int tar=s.nextInt();
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if((arr[i]+arr[j])==tar){
				System.out.println(arr[i]+" "+arr[j]);
				count=1;
				}
			if(count==1){
				break;
			}
	}
		if(count==1){
			break;
		}
	}

}}
