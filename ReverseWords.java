package guvi;

import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        String[] x=str.split(" ");
        System.out.println(x[1]+" "+x[0]);
	}
}
