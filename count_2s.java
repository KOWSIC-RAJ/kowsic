package guvi;

import java.util.Scanner;

public class count_2s {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		int a=0;
		int temp=n;
		for(int i=n;i>=0;){
			a++;
			while(i>0){
				if(i%10==2){
					count++;
				}
				i/=10;			
			}
			i=temp-a;
		}
		System.out.println(count);
	}
}
