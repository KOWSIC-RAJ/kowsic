package guvi;
import java.util.Scanner;
public class NumberEqualsIndex {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		int arr[]=new int[10];
		System.out.println("Enter the values of an array");
		for(i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			if(arr[i]==i){
				System.out.println("The number whose value equal to the index is : "+i);
			}
		}
		s.close();

}
}