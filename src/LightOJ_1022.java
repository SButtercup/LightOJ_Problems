package LightOJ_Problems;
import java.util.Scanner;
import java.lang.Math;
public class LightOJ_1022 {
	public static void main(String[]args){
		
		int test_case;
		double rad,area;
		double pi=2*Math.acos(0.0);
		Scanner sc=new Scanner(System.in);
		test_case=sc.nextInt();
		for(int i=1;i<=test_case;i++){
			rad=sc.nextDouble();
			area=4*(rad*rad)-(pi*(Math.pow(rad,2)));
			area=area+Math.pow(10,-9);
			System.out.print("Case "+i+": ");	
			System.out.format("%.2f\n",area);
		}
				
	  sc.close();	
	}

}
