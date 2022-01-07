import java.util.Scanner;

public class Ifelse {

public static void main(String [] args) {
		
		System.out.println("Enter the Subject Marks");
		Scanner theValue = new Scanner(System.in);
		int flag=0;
		int a = theValue.nextInt();
		int b = theValue.nextInt();
		int c = theValue.nextInt();
		int sum = a + b + c;
		
		if(a >= 40) 
		 flag++;
		if(b >=40) 
		 flag++;
		if(c >=40) 
		 flag++;
		if(sum >= 125)
		 flag++;
		if(flag==4)
		 System.out.println("Congraulations,You have Passed the Exam");
		else
             System.out.println("Sorry, You have Failed in the Exam");
						
	}
}