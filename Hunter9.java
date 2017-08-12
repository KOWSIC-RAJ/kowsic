package guvi;

import java.util.Scanner;

public class Hunter9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		int min=999;
		int temp1=0;
		int temp2=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				sum=0;
				sum=arr[i]+arr[j];
				if(sum<0){
					sum*=-1;
				}
				if(sum<min){
					min=sum;
					temp1=i;
					temp2=j;
				}
			}
		}
		System.out.println(arr[temp1]+" "+arr[temp2]);		
	}
}
