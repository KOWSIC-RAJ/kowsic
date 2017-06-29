package guvi;

import java.util.Scanner;

public class RemoveNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int i=0,j=0;
		int arr[]=new int[size];
		for(i=0;i<size;i++){
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the number to be removed");
		int n=s.nextInt();
		for(i=0;i<size;i++){
			if(arr[i]==n){
				arr[i]='\0';
			}
			if(arr[i]!='\0')
				System.out.print(arr[i]+" ");
		}
	}


}
