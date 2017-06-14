package guvi;
import java.util.Scanner;
public class RepeatedRegisterNumber {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int i,j,count=0;
		System.out.println("Enter the number of register ID :");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the register numbers :");
		for(i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
		    if(arr[i]!='\0'){
			for(j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					count++;
					arr[j]='\0';
				}
			}
			if(count>0){
				System.out.println("Repeated register numbers : "+arr[i]);
			}
		    }
		}
	}
	

}
