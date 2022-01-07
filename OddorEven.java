package Assignment30;
import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number to find odd or even");
    int num=sc.nextInt();
    sc.close();
    if(num %2==0)
    	System.out.println(num+"  is even");
    else
    	System.out.println(num+"  is odd");
    	
}
}
