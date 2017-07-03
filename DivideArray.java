package guvi;

import java.util.Scanner;

public class DivideArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int arr[]=new int[n];
	   int i;
	   for(i=0;i<n;i++){
		   arr[i]=s.nextInt();   
	   }
	   int sum1=0;
	   int sum2=0;
	   float avg1=0;
	   float avg2=0;
	   if(n%2!=0){
		   for(i=0;i<(n/2)+1;i++){
			   sum1+=arr[i];
		   }
		    avg1=sum1/((n/2)+1);
		    for(i=(n/2)+1;i<n;i++){
			   sum2+=arr[i];
		    }
		   avg2=sum2/(n/2);
		   if(avg1==avg2){
			   System.out.print("[");
			   for(i=0;i<(n/2)+1;i++){
				   System.out.print(arr[i]+" ");
			   }			   
			   System.out.print("]");
			   System.out.print("[");
			   for(i=(n/2)+1;i<n;i++){
				   System.out.print(arr[i]+" ");
			   }
			   System.out.print("]");
		   }
		   else
		   {
			   System.out.println("Not Possible");
		   }
		   }
	   else
	   {
		   for(i=0;i<(n/2);i++){
			   sum1+=arr[i];
		   }
		   avg1=sum1/(n/2);
		   for(i=(n/2);i<n;i++){
			   sum2+=arr[i];
		   }
		   avg2=sum2/(n/2);
		   if(avg1==avg2){
			   System.out.print("[");
			   for(i=0;i<(n/2);i++){
				   System.out.print(arr[i]+" ");
			   }
			   System.out.print("]");
			   System.out.print("[");
			   for(i=0;i<(n/2);i++){
				   System.out.print(arr[i]+" ");
			   }
			   System.out.print("]");
			   }
		   else
		   {
			   System.out.println("Not Possible");
		   }
		   
		   
	   }
	
	}
}
