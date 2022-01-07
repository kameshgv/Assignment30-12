package Assignment30;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int i,flag=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number to find prime or not");
	    int num=sc.nextInt();
	    sc.close();
		if(num==0||num==1)
			System.out.println(num+"  is not a prime number");
		else {
			for(i=2;i<num;i++)
			{
				if(num%i==0)
				{
					System.out.println(num+" is not a prime number");
					flag= 1;
					break;
				}
			}
			if(flag==0)
				System.out.println(num+"  is a prime number");
		}
	  }
	}
