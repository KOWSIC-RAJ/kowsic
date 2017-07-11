package guvi;

import java.util.Scanner;

public class AlternateSorting {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0;
		int arr[]=new int[n];
		for(i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int temp=0;
		for(i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int res[]=new int[n];
		int a=0;
		for(i=0;i<n;i+=2){
			res[i]=arr[a++];
		}
		int l=arr.length-1;
		for(i=1;i<n;i+=2){
			res[i]=arr[l--];
		}
		for(i=0;i<n;i++){
		System.out.println(res[i]);
		}
	}
}
