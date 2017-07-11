package guvi;

import java.util.Scanner;

public class hun119 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r1=s.nextInt();
		int r2=s.nextInt();
		int r3=s.nextInt();
		int r4=s.nextInt();
		int x=s.nextInt();
		int max=-9999;
		int min=9999;
		int sum=r1+r2+r3+r4;
		int arr[]={r1,r2,r3,r4};
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(sum-max);
		System.out.println(sum-min);
	}
}
