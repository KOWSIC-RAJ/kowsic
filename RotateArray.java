package guvi;

import java.util.Scanner;

public class RotateArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0;
		int arr[]=new int[n];
		for(i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		System.out.println("Index:");
		int d=s.nextInt();
		int sub[]=new int[d];
		for(int j=0;j<d;j++){
			sub[j]=arr[j];
		}
		int x = 0;
		for(i=d;i<n;i++){
			arr[x]=arr[i];
			x++;
		}
		int a=0;
		for(;x<n;x++)
		{
			arr[x]=sub[a];
			a++;
		}
		
		for(int k=0;k<n;k++){
	 	System.out.print(arr[k]+" ");
		}
		
	}

}
