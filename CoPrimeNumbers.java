package guvi;

import java.util.Scanner;

public class CoPrimeNumbers {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int arr1[]=new int[20];
        int arr2[]=new int[20];
        arr1[0]=1;
        arr2[0]=1;
        int x=1;
        for(int i=2;i<=a;i++){
        	if(a%i==0){
        		arr1[x++]=i;
        	}
        }
        x=1;
		for(int i=2;i<=b;i++){
			if(b%i==0){
				arr2[x++]=i;
			}
		}
		int count=0;
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				if(arr1[i]==arr2[j]){
				count++;
				}
			}
		}
		if(count==1){
			System.out.println(a+" and "+b+" "+" are Co-Prime numbers");
		}
		else
		{
			System.out.println(a+" and "+b+" "+" are not a Co-Prime numbers");
		}		
	}
}
