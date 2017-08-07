package guvi;

import java.util.Scanner;

public class Hunter98 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int digit=s.nextInt();
		int start=s.nextInt();
		int end=s.nextInt();
		int count=0;
		int res=0;
		for(int i=start;i<end;i++){
			count=0;
			for(int j=2;j<=i;j++){
				if(i%j==0){
					count++;
				}				
			}
			if(count==1){
				int temp=i;
				while(temp>0){
					int rem=temp%10;
					if(rem==digit){
						res++;
					}
					temp/=10;
				}
			}
			
		}
		System.out.println(res);
	
	}
}
