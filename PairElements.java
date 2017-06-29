package guvi;

import java.util.Scanner;

public class PairElements {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i=0;
		int j=0;
		int count=0;
		int arr[]=new int[num];
		for(i=0;i<num;i++){
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the difference number");
		int d=s.nextInt();
		for(i=0;i<num;i++){
			for(j=i+1;j<num;j++){
				if(arr[i]<arr[j]){
					if(arr[j]-arr[i]==d){
						//System.out.println(arr[i]+","+arr[j]);
						count++;
					}
				}
				else
				{
					if(arr[i]-arr[j]==d){
						//System.out.println(arr[i]+","+arr[j]);
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
