package LightOJ_Problems;

import java.math.BigDecimal;
import java.util.Scanner;
public class LightOJ_1072 {
	
	public static void main(String[]args){
		
		double Radius,rad;
		int no_of_circs,case_no,i;
		
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			
			case_no=sc.nextInt();
			
			for(i=1;i<=case_no;i++){
				
				Radius=sc.nextDouble();
				no_of_circs=sc.nextInt();
				double ang=Math.toRadians(180.0/no_of_circs);
				rad=(Radius*(Math.sin(ang)))/((Math.sin(ang)+1));
				Double rad1=new Double(rad);
			    BigDecimal rad2=BigDecimal.valueOf(rad1).setScale(10,BigDecimal.ROUND_HALF_DOWN);
			    double rad3=rad2.doubleValue();
				System.out.println("Case "+i+": "+rad3);
			}
		}
		sc.close();
		
	}

}
