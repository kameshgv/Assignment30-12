package Assignment30;
import java.util.Scanner;

public class Fibonocci {

	public static void main(String[] args) {
		int num1=0,num2=1,num3;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the limit to find fibanocci");
	    int limit=sc.nextInt();
	    sc.close();
	    System.out.println(num1+" "+num2);
	    for(int i=2;i<limit;i++)
	    {
	    	num3=num1+num2;
	    	System.out.println(""+num3);
	    	num1=num2;
	    	num2=num3;
	    }}}


