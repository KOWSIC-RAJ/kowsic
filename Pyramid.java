package guvi;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<=n;i++){
			for(int j=n;j>i;j--){
				System.out.print(" ");
			}
			for(int k=0;k<i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
