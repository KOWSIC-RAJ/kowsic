package guvi;

import java.util.Scanner;

public class pro60 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int time=s.nextInt();
		int a=3;
		int size=(a*1)+(a*2)+(a*4)+1;//to compute array size 
		int t=0;                     
		int temp=a;
		int value[]=new int[size];
		for(t=1;t<size;t++){
			value[t]=a;
			//System.out.println(i+" "+value[i]);
			--a;
			if(a==0&&t==3){
				a=temp*2;
			}
			if(a==0&&t==9){
				a=temp*4;
			}		
		}
		System.out.println(value[time]);
	}
}
