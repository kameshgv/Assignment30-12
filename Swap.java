package Assignment30;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the two numbers");
	    int num1=sc.nextInt();
	    int num2=sc.nextInt();
	    sc.close();
	    num1=num1+num2;
	    num2=num1-num2;
	    num1=num1-num2;
	    System.out.println("after swapping  : num1= "+num1+" num2= "+num2 );
		}

}
