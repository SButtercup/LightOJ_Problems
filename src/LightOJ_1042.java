package LightOJ_Problems;
import java.util.Scanner;


public class LightOJ_1042 {
	public static void main(String[]args){
	int test_case,i,no,k,flag,div,count;
	Scanner sc=new Scanner(System.in);
	while(sc.hasNextInt()){
		test_case=sc.nextInt();
		if(test_case>65)
			break;
		for(i=1;i<=test_case;i++)
		{
			no=sc.nextInt();
			if(no==0)
				break;
			div=no;
			count=0;
		    while(div>0){
		    	if(div%2==1)
		    		count++;
		    	div=div/2;
		    	
		    }
		    flag=0;
		    while(flag!=1)
		    {
		    	
		    	no=no+1;
		    	div=no;
				k=0;
			    while(div>0){
			    	if(div%2==1)
			    		k++;
			    	div=div/2;
			    }
			    if(k==count){
			    	flag=1;
			    	System.out.println("Case "+i+": "+no);
			    }
		    }
		}
	}
	sc.close();
	}
}
