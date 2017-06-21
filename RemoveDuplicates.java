package guvi;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
	String str=s.next();
	String st="";
	int i,j;
	int n=str.length();
	char[] ch=str.toCharArray();
	for( i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(ch[i]==ch[j]){
				ch[j]='\0';
		}
	}
	}
	for(i=0;i<n;i++){
		if(ch[i]!='\0'){
			st=st+ch[i];
		}
	}
		System.out.println(st);
	}

}

