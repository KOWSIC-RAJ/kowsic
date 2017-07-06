package guvi;

import java.util.Scanner;

public class AstreixPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int i=0,j=0;
		for(i=0;i<temp;i++){			
		for(j=0;j<(2*n)+1;j++){
			if(j!=(n*2)/2)
			System.out.print('*');
			else
				System.out.print(" ");			
		}
		n--;
		System.out.println();
		}
	}

}
