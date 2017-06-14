package guvi;
import java.util.Scanner;
public class UniqueElement {
  public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of values :");
		int n=s.nextInt();
		int i,j,count=0;
		int arr[]=new int[10];
		System.out.println("Enter the values of an array :");
		for(i=0;i<n;i++){
			arr[i]=s.nextInt();
			}
		for(i=0;i<n;i++){
			count=0;
			for(j=0;j<n;j++){
				if(arr[i]==arr[j]){
					count++;
				}
				
			}
			if(count<2)
				System.out.println("Unique value in the array is : "+arr[i]);
		}


  }
}
