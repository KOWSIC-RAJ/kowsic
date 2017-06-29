package guvi;

import java.util.Scanner;

public class ReplaceNextGreatestElement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int i=0,j=0;
		int arr[]=new int[size];
		for(i=0;i<size;i++){
			arr[i]=s.nextInt();
		}
		int max=-111;
		for(i=0;i<size;i++){
			max=0;
			for(j=i+1;j<size;j++){
				if(arr[j]>max){
					max=arr[j];
				}
			}
			arr[i]=max;
			System.out.print(arr[i]);
		}
	}
}
