package guvi;

import java.util.Scanner;

public class Hunter68 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int max=-9999;
		int index=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n-1;i++){
			if(arr[i]-arr[i+1]>max){
				max=arr[i]-arr[i+1];
				index=i;
			}
		}
		System.out.println(index);
	}
}
