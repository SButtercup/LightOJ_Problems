package LightOJ_Problems;
import java.util.Scanner;

public class LightOJ_1008 {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
	    long cell_no,j,x,y;
		int cases,k;
		while(sc.hasNextInt()){
			cases=sc.nextInt();
			
			for(k=1;k<=cases;k++){
				cell_no=sc.nextLong();
				j=(long)Math.ceil(Math.sqrt((double)(cell_no)));
				if(j*j-cell_no<j)
				{
					x=j;
					y=j*j-cell_no+1;
				}
				else
				{
					x=-j*j+2*j+cell_no-1;
					y=j;
				}
				if(j%2==1)
				{
					long temp;
					temp=x;
					x=y;
					y=temp;
				}
				System.out.println("Case"+" "+k+": "+x+" "+y);	
				
				
			}
		}
		sc.close();
		
	}
	

}
