package guvi;

import java.util.Scanner;

public class player9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		int count=0;
		int res=0;
		for(int i=start;i<=end;i++){
			count=0;
			for(int j=2;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==1){
				res++;
			}
		}
		System.out.println(res);
	}
}
