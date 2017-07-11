package guvi;

import java.util.Scanner;

public class hun113 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int L=s.nextInt();
		int R=s.nextInt();
		
		int temp=0;
		for(;L<R;L++){
			int sum=0;
			int count=0;
			int x=L;
			while(x>0){
				sum+=x%10;
				x/=10;
			}
			for(int i=2;i<=sum;i++){
				if(sum%i==0){
					count++;
				}
			}
			if(count==1){
				temp++;
			}
		}
		System.out.println(temp);
		
	}

}
