package LightOJ_Problems;
import java.util.Scanner;
public class LightOJ_1136 {
	
	public static void main(String[]args){
		
		int test_case,cases,no1,no2;
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			test_case=sc.nextInt();
			for(cases=1;cases<=test_case;cases++)
			{
				
				no1=sc.nextInt();
				no2=sc.nextInt();
				
				System.out.println("Case "+cases+": "+(value(no2)-value(no1-1)));
				
			}
		}
		sc.close();
	}
	static int value(int no)
	{
		int result;
		result=(no/3)*2;
		if(no%3==2)
			result++;
		return result;
	}

}
