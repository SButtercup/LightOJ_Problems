package LightOJ_Problems;
import java.util.Random;
import java.util.Scanner;
public class LightOJ_1001 {
	public static void main(String[]args){
		Random num=new Random();
		Scanner cases=new Scanner(System.in);
		int test,no,k,n1;
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
			n1=num.nextInt(no);
			System.out.println(n1+" "+(no-n1));
			}
			else if(no>10&&no<=20)
			{
				n1=num.nextInt(no);
				while((no-n1)>10){
					n1++;}
				System.out.println(n1+" "+(no-n1));
			}
			else
				continue;
		}
		}
		cases.close();
		
	}
}
