package guvi;

import java.util.Scanner;

public class Elephant {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int noOfElephants=s.nextInt();
	    int maxWeight=s.nextInt();
	    int arr[]=new int[noOfElephants];
	    for(int i=0;i<noOfElephants;i++){
	    	arr[i]=s.nextInt();
	    }
	    int count=0;
	    int sum=0;
	    for(int i=0;i<noOfElephants;i++){
	    	sum+=arr[i];
	    	if(sum<maxWeight){
	    		count++;
	    	}
	    	else
	    	{
	    		break;
	    	}
	    }
	    System.out.println(count);
	    
	}

}
