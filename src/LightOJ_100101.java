package LightOJ_Problems;
import java.util.Scanner;
public class LightOJ_100101 {
	public static void main(String[]args){
		Scanner cases=new Scanner(System.in);
		int test,no,k;
		while(cases.hasNextInt()){
		test=cases.nextInt();
		if(test>25&&test<0)
			break;
		for(k=1;k<=test;k++)
		{
			no=cases.nextInt();
			if(no==0)
			{
				System.out.println("0 0");
				continue;
			}
			else if(no<=10&&no>0){
			System.out.println("1"+" "+(no-1));
			}
			else if(no>10&&no<=20)
			{
				System.out.println("10"+" "+(no-10));
			}
			else
				continue;
		}
		}
		cases.close();
		
	}
}
