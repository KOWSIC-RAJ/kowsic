package guvi;

import java.util.Scanner;

public class hun116 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
		int count=0;
		int a=0;
		int temp=num;
		while(num>0){
			num/=10;
			++count;
		}
		while(temp>0){
			count-=1;
			sum+=Math.pow(temp%10,count);
			temp/=10;
		}
		System.out.println(sum);		
	}
}
