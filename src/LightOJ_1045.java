 package LightOJ_Problems;
 import java.util.Scanner;

public class LightOJ_1045 {
	public static void main(String[]args){
		int i,d,n;
		int test,k;
		long no;
		double arr[]=new double[1000010];
		Scanner sc=new Scanner(System.in);
		arr[0]=0;
		for(i=1;i<=1000000;i++){
		 arr[i]=(double)(Math.log(i)+arr[(i-1)]);
		}
		test=sc.nextInt();
		for(k=1;k<=test;k++){
			n=sc.nextInt();
			d=sc.nextInt();
			no=(long)(arr[n]/(arr[d]-arr[d-1])+1);
			System.out.println("Case "+k+": "+no);
			
		}
		
		sc.close();
	}

}
