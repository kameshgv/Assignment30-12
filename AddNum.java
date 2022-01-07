import java.util.Scanner;

public class AddNum {
	int num1,num2,result;

	public static void main(String[] args) {
		new AddNum().input();
		
	}
	
		
		void input()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter two numbers");
			num1=scan.nextInt();
		    num2=scan.nextInt();
		    scan.close();
		     add();
			}
		void add()
		{
			result=num1+num2;
			 display();
		}

		void display()
		{
			System.out.println("THE ADDITION OF NUMBERS IS:"+result);
		}

		}
