package guvi;

import java.util.Scanner;

public class player1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());		
	}
}
