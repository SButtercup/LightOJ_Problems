package LightOJ_Problems;

import java.util.Scanner;
public class LightOJ_1116 {
	
	
	public static void main(String[]args)
	{
		
		long NO;
		int i,test_case;
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext())
		{
			test_case=sc.nextInt();
			
			for(i=1;i<=test_case;i++)
			{
				long tempeven=1;
				NO=sc.nextLong();
				if(NO%2==1)
					System.out.println("Case "+i+": Impossible");
				else
				{
					while(NO!=0)
					{
						tempeven <<= 1;
						NO >>= 1;
						if(NO%2==1){
							System.out.println("Case "+i+": "+NO+" "+tempeven);
							break;
						}
			
					}
					
				}
				
				
			}
		}
		sc.close();
	}

}
