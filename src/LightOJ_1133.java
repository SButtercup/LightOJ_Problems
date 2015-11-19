package LightOJ_Problems;

import java.util.Scanner;
public class LightOJ_1133 {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int test_case,i,n,m,j,k,l,d,y,z,temp;
		char ch;
		
		while(sc.hasNext())
		{
			test_case=sc.nextInt();
			for(i=1;i<=test_case;i++)
			{
				n=sc.nextInt();
				m=sc.nextInt();
				int arr[]=new int[n];
				for(j=0;j<n;j++)
				{
					arr[j]=sc.nextInt();
				}
				for(k=1;k<=m;k++)
				{
					ch=sc.next(".").charAt(0);
					switch(ch)
					{
					case 'S':d=sc.nextInt();
							 for(l=0;l<n;l++)
							 {
								 arr[l]+=d;
							 }
							 break;
					case 'M':d=sc.nextInt();
							 for(l=0;l<n;l++)
					         {
							  		arr[l]*=d;
					         }
							 break;
					case 'D':d=sc.nextInt();
						     for(l=0;l<n;l++)
						     {
						    	 arr[l]/=d;
						     }
						     break;
					case 'R':int tmp;
							 for(int v=0,w=n-1;v<(n/2);v++,w--)
							  {
								  tmp=arr[v];
								  arr[v]=arr[w];
								  arr[w]=tmp;
							  }
							  break;
					case 'P' :y=sc.nextInt();
							  z=sc.nextInt();
							  temp=arr[y];
							  arr[y]=arr[z];
							  arr[z]=temp;
					
					default:break;
					}
					
				}
				System.out.println("Case "+i+":");
				for(j=0;j<n;j++)
				{
					System.out.print(arr[j]);
					if(j!=(n-1))
						System.out.print(" ");
					else
						System.out.println();
				}
				
			}
		}
		sc.close();
		
	}

}
