package Assignment30;

import java.util.Scanner;

public class SumofDivby3or5 {
	         int sum=0;
	        int sum(int n){
	         for(int i=0;i<=n;i++)
	         {
	        	 if(i%3==0||i%5==0)
	        		 sum+=i;
	         }
	        return sum;
	        }

	public static void main(String[] args) {
		
		 SumofDivby3or5 p= new SumofDivby3or5();
		 Scanner sc=new Scanner (System.in);
			System.out.println("enter the  number");
		    int n=sc.nextInt();
		    sc.close();
		    System.out.println(p.sum(n));

	}

}
