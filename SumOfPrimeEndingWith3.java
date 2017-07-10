package guvi;

import java.util.Scanner;

public class SumOfPrimeEndingWith3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		int x=0;
		int arr[]=new int[100];
		for(int i=2;i<n;i++){
			count=0;
			for(int j=2;j<n;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==1){
				arr[x++]=i;
			}
		}
		int sum=0;
		for(int a=0;a<x;a++){
			if(arr[a]%10==3){
				sum+=arr[a];				
			}
		}
		System.out.println(sum);
		}
}
