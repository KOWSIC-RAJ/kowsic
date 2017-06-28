package guvi;

import java.util.Scanner;

public class PossibleSubset {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println("Enter input length");
		int n=s.nextInt();
		System.out.println("The subsets are");
		for(int i=0;i<str.length();i++){
		for(int j=i+1;j<str.length();j++){
			System.out.print(str.substring(i,n-1));
			System.out.println(str.charAt(j));
		}
		break;
	}

}
}
