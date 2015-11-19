package LightOJ_Problems;
import java.util.*;
import java.util.regex.Pattern;

public class LightOJ_1113 {

	public static void main(String[] args) {
		ArrayList<String> forw=new ArrayList<>();
		ArrayList<String> back=new ArrayList<>();
		int test_case,caseNo;
		String input,visit;
	    String pattern="\^(https?:\/\/)?([\da-zA-Z\.-]+)\.([a-zA-Z\.]{2,6})([\/\w\.-]*)*\/?$";
		
		//Pattern pat;
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			test_case=sc.nextInt();
			input=sc.nextLine();
			for(caseNo=1;caseNo<=test_case;caseNo++)
			{
				System.out.println("Case "+caseNo+":");
				back.add("http://www.lightoj.com/");
				//System.out.println(back.size());
				input=sc.nextLine();
				while(input.compareTo("QUIT")!=0)
				{
				try{
					if(input.compareTo("VISIT")==0)
					{
						visit=sc.nextLine();
						back.add(visit);
						System.out.println(visit);
					
					}
					else if(input.compareTo("FORWARD")==0)
					{
						if(forw.size()==1)
						{
							visit=forw.get(forw.size()-2);
							System.out.println(visit);
							back.add(visit);	
						}
						else{
						visit=forw.get(forw.size()-2);
						System.out.println(visit);
						back.add(visit);
						forw.remove(forw.size()-2);
						}
					}
					else if(input.compareTo("BACK")==0){
						if(back.size()==1)
						{
							visit=back.get(back.size()-2);
							System.out.println(visit);
							forw.add(visit);
						}
						else{
						visit=back.get(back.size()-2);
						System.out.println(visit);
						forw.add(visit);
						back.remove(back.size()-2);}
					}
					else
						break;
				}catch(IndexOutOfBoundsException e)
				{
					System.out.println("Ignored");
					if(input.compareTo("FORWARD")==0) forw.add(back.get(back.size()-1));
					if(input.compareTo("BACK")==0) back.add(forw.get(forw.size()-1));	
				}
				input=sc.nextLine();
				
				}
			  
			}
		}
		sc.close();
		
	}

}
