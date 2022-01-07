package Assignment30;
import java.util.Scanner;

public class Printprimenumbers {
	

	public static void main(String[] args) {
		int flag=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the limit");
	    int limit=sc.nextInt();
	    sc.close();
	     /* if(limit<2)
	    		System.out.println(" PRIME NUMBERS ARE NOT IN THE GIVEN LIMIT PLEASE ENTER THE VALID LIMIT");
	    else 
	    {*/
	    	for(int i=2;i<limit ;i++)
	    	{
	    		flag=0;
	    		for(int j=2;j<limit;j++)
	    		{
	    			if(i%j==0)
	    				flag=1;
	    			
	    		}
	    		if(flag==0)
	    			System.out.println(i);
	    	}
	    		
	    }}