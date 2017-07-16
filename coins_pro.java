package guvi;

import java.util.Scanner;

public class coins_pro {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0;
	    int n=s.nextInt();
	    int coins[]=new int[n];
	    for(i=0;i<n;i++){
	    	coins[i]=s.nextInt();
	    }
	    int person1=0;
	    int person2=0;
	    for(i=0;i<n;i++){
	    	if(i%2==0){
	    		person1+=coins[i];
	    	}
	    	else
	    	{
	    		person2+=coins[i];
	    	}
	    }
	    if(person1>person2){
	    	System.out.println(person1+" is the maximum amount value that person1 won the game");
	    }
	    else
	    {
	    	System.out.println(person2+" is the maximum amount value that person2 won the game");
	    }
	}
}
