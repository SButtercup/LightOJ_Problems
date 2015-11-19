package LightOJ_Problems;

import java.util.Scanner;
public class LightOJ_104201 {
	public static void main(String[]args){
		int test_case,i,no,k,div,res,l;
		int[]arr=new int[100];
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
				arr[0]=0;
				k=1;
			    while(div>0){
			    	arr[k]=div%2;
			    	div=div/2;
			    	k++;
			    }
			    k--;
			    for(int m=1,n=k;m<=k/2;m++,n--){
			    	int p;
			    	p=arr[m];
			    	arr[m]=arr[n];
			    	arr[n]=p;
			    }
			    int sorter=0;
			    for(l=k;l>=0;l--){
			    	if(arr[l]==1&&arr[l-1]==0){
			    		int temp;
			    		temp=arr[l];
			    		arr[l]=arr[l-1];
			    		arr[l-1]=temp;
			    		sorter=l;
			    		break;
			    	}
			    }
			    for(int m=sorter;m<=k;m++){
			    	 for(int p=m+1;p<=k;p++){
			    		 if(arr[m]>arr[p]){
			    			 int t;
			    			 t=arr[m];
			    			 arr[m]=arr[p];
			    			 arr[p]=t;
			    			 
			    		 }
			    		 
			    	 }
			    	
			    	
			    }
			    
			    res=0;
			    int pw=k;
			    for(int h=0;h<=pw;h++,k--){
			    	
			    	res=res+(arr[h])*((int)(Math.pow(2,k)));
			    	
			    }
			    
			    
			    System.out.println("Case "+i+": "+res);
			   
			}
		}
		sc.close();
		}

}
