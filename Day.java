package guvi;

import java.util.Scanner;

public class Day {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	String day=s.next();
	if(day.equalsIgnoreCase("Mon")||day.equalsIgnoreCase("Tue")||day.equalsIgnoreCase("Wed")||day.equalsIgnoreCase("Thu")||day.equalsIgnoreCase("Fri")){
		System.out.println(true);
	}else{
		System.out.println(false);
	}
	}
}
