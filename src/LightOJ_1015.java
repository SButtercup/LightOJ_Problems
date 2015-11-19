package LightOJ_Problems;
import java.util.Scanner;

public class LightOJ_1015 {
	static Scanner sc=new Scanner(System.in);
	static int sum;
	static short std_no,test_case,x,i;
	public static void main(String[]args){
			test_case=sc.nextShort();
			for(i=1;i<=test_case;i++){
				 std_no=sc.nextShort();
				 sum=0;
				 while(std_no>0){
					 x=sc.nextShort();
					 if(x>=0)
					 {
						 sum+=x;
					 }
					 std_no--;
				 }
				 System.out.println("Case "+i+": "+sum);
				 
			}
		
	}

}
