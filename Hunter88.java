package guvi;

import java.util.Scanner;

public class Hunter88 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		StringBuffer sb=new StringBuffer(str).reverse();
		String x=sb.toString();
		char ch[]=x.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]!='\0'){
				for(int j=i+1;j<ch.length;j++){
					if(ch[i]==ch[j]){
					ch[j]='\0';
				    }
			    }
			}
		}
		String se="";
		for(int i=0;i<ch.length;i++){
			if(ch[i]!='\0'){
				se+=ch[i];
			}
		}
		System.out.println(se);
	}
}

