package guvi;

import java.util.Scanner;

public class player11 {
	public static void Workingday(String day){
		if(day.equalsIgnoreCase("Sunday")){
			System.out.println("False");
		}
		else
		{
			System.out.println("True");
		}		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        String day=s.next();
        Workingday(day);
	}
}
