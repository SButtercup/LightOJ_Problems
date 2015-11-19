package LightOJ_Problems;

import java.util.Scanner;

public class LightOJ_1069 {
	public static void main(String[]args){
		int my_floor,lift_floor,total_time,test,k;
		Scanner sc=new Scanner(System.in);
		test=sc.nextInt();
		for(k=1;k<=test;k++){
			my_floor=sc.nextInt();
			lift_floor=sc.nextInt();
			total_time=((Math.abs(lift_floor-my_floor)+my_floor)*4)+19;
			System.out.println("Case "+k+": "+total_time);
			
		}
		
		sc.close();
	}

}
