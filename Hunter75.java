package guvi;

import java.util.Scanner;

public class Hunter75 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(); //no of elements of an array
		int arr[]=new int[n];
		int i=0;
		int temp=0;
		for(i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			if(n-1==i){
				arr[n-1]=-1;
				temp++;				
			}
			if(temp==0){
			 if(arr[i+1]<arr[i]){
				arr[i]=arr[i+1];
			 }
			 else{
				arr[i]=-1;
			 }			
			}
			System.out.print(arr[i]+" ");
		}
	}
}
