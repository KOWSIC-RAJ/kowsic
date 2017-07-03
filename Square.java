package guvi;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	   int x1=s.nextInt();
	   int y1=s.nextInt();
	   int x2=s.nextInt();
	   int y2=s.nextInt();
	   int x3=s.nextInt();
	   int y3=s.nextInt();
	   int x4=s.nextInt();
	   int y4=s.nextInt();
	   if((x1==x2&&x3==x4)&&(y1==y4&&y2==y3)){
		   System.out.println("Square");
	   }
	   else
	   {
		   System.out.println("Not a Square");
	   }
	}
}
