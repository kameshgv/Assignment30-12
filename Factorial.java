package Assignment30;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number to find foctorial");
    int num=sc.nextInt();
    sc.close();
	int i,fact=1;
	for(i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println("factorial of "+num+ "  is "+fact);
}
}
