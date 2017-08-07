package guvi;

import java.util.Scanner;

public class Hunter92 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		st=st.replaceAll("( )+"," ");
		System.out.println(st);
	}
}
