package LightOJ_Problems;

import java.util.Scanner;
public class LightOJ_1182 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int no,test_case,case_no,count;
		while(sc.hasNext())
		{
			test_case=sc.nextInt();
			for(case_no=1;case_no<=test_case;case_no++)
			{
				count=0;
				no=sc.nextInt();
				while(no!=0)
				{
					
					if((no%2)==1)
					{
						count++;
					}
					no/=2;
					
				}
				if((count%2)==1)
					{System.out.println("Case "+case_no+": odd");}
				else
					{System.out.println("Case "+case_no+": even");}
			}
		}
		sc.close();
	}

}
