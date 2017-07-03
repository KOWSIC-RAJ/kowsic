package guvi;

import java.util.Scanner;

public class SnakeGame {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	int i=0;
	int j=0;
	int n=s.nextInt();
	for(i=0;i<n;i++){
		System.out.println();
		for(j=0;j<n;j++){
			if(i==0||j==0||j==n-1||i==n-1){
				System.out.print('*');
			}
			else
			{
				System.out.print(" ");
			}
		}
	}
	}
}
