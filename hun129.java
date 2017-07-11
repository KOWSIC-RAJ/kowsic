package guvi;

import java.util.Scanner;

public class hun129 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int arr[]=new int[str.length()];
		int i;
		for(i=0;i<arr.length;i++){
			char ch=str.charAt(i);
			arr[i]=ch;
		}
		int sum=0;
		for(i=0;i<arr.length-1;i++){
			sum+=arr[i+1]-arr[i];
		}
		System.out.println(sum);
		int n=sum-arr[0];
		System.out.println(n);
		if(n<0){
			char ch=(char) ((char) n+127);
			System.out.println(ch);
		}
		else
		{
			char ch=(char) n;
			System.out.println(ch);
		}
			
		
	}
}
