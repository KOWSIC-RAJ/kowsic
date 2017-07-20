package guvi;

import java.util.Scanner;

public class pro64 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		int A=s.nextInt();
		int count=0;
		int empIDI[]=new int[N];
		int empIDJ[]=new int[N];
		for(int i=0;i<N;i++){
			empIDI[i]=s.nextInt();
			empIDJ[i]=s.nextInt();
		}
		int sal[]=new int[N];
		for(int i=0;i<N;i++){
			sal[i]=s.nextInt();
		}
		for(int i=0;i<N;i++){
			if(A==empIDI[i]){
				if(sal[A-1]>sal[empIDJ[i]-1]){
				count++;
				}
			}	
			if(A==empIDJ[i]){
				if(sal[A-1]>sal[empIDI[i]-1]){
					count++;
				}
				
			}
		}
		System.out.println(count);
		
	}

}
