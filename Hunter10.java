package guvi;

import java.util.ArrayList;
import java.util.Scanner;

public class Hunter10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		 for(int i=0;i<n;i++){
			 a1.add(s.nextInt());			 
		 }
		 for(int i=0;i<m;i++){
			 a2.add(s.nextInt());
		 }
		 boolean isSubset = a1.containsAll(a2);
		 if(isSubset==true){
			 System.out.println("a2 is a subset of a1");
		 }
		 else
		 {
			 System.out.println("a2 is not a subset of a1");
		 }		
	}
}
