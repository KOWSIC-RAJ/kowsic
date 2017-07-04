package Guvi;

import java.util.Scanner;

public class Resturant {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int i=0;
		int costArr[]=new int[n];
		for(i=0;i<n;i++){
			costArr[i]=s.nextInt();			
		}
		int sum=0;
		int b=s.nextInt();
		for(i=0;i<n;i++){
			if(i!=k)
			sum+=costArr[i];
		}
		if(sum/2==b){
			System.out.println("Bon Appetit");
		}
		else
		{
			System.out.println(b-(sum/2));
		}
		
	}

}
