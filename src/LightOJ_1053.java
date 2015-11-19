package LightOJ_Problems;

import java.util.Scanner;

public class LightOJ_1053 {
	public static void main(String[]args){
		Scanner test=new Scanner(System.in);
		int a,b,c,l,k,n,o,p;
		while(test.hasNextInt()){
			l=test.nextInt();
			for(k=1;k<=l;k++){
				a=test.nextInt();
				b=test.nextInt();
				c=test.nextInt();
				if((a<=0)||(b<=0)||(c<=0))
					continue;
				if(a>b&&a>c){
					n=a;
					o=b;
					p=c;
				}
				else if(b>c){
					n=b;
					o=a;
					p=c;
				}
				else{
					n=c;
					o=a;
					p=b;
				}
				if(Math.pow(n,2)==Math.pow(o,2)+Math.pow(p,2))
					System.out.println("Case "+k+": yes");
				else
					System.out.println("Case "+k+": no");
						
				}
					
			}
		
		test.close();	
	}
}
