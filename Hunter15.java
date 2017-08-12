package guvi;

import java.util.Scanner;

public class Hunter15 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int sum=0;
		int temp=0;
		int max=0;
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n-2;i++){
			sum=0;
			for(int j=i;j<i+3;j++){
				sum+=arr[j];
			}
			if(sum>max){
				max=sum;
				temp=i;
			}
		}
		for(int k=temp;k<temp+3;k++){
			System.out.print(arr[k]+" ");
		}		
	}
}
