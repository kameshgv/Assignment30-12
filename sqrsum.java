package Assignment30;
import java.util.Scanner;
public class sqrsum {
	public static void main(String[] args) {
		sqrsum p=new sqrsum();
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the limit to find difference");
	    int n=sc.nextInt();
	    sc.close();
	    System.out.println(p.difference(n));
		
		}
	int sum=0,sumofsqr=0,sqrofsum;
	int difference(int n) {
		for(int i=0;i<=n;i++)
		{
			sum+=i;
			
		}
		sqrofsum=sum*sum;
		for(int i=0;i<=n;i++)
		{
			sumofsqr=sumofsqr+(i*i);
		}
		return sqrofsum-sumofsqr;
	}
	

	
}
