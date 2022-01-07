package Assignment30;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner7;
public class powerof2 {
	public boolean checkNumber(int num) {
           boolean flag=false;   
            if(num%2==0){
                  int x=2;
                  int p=1;
                  lab:
                  while(true)
                  {
                    for(int i=1;i<=num/2;i++)
                    {
                   	p=p*x;
                    if(p<num)
                      {
                    	flag=false;
                         continue;
                             }
                     else if(p==num)
                       {
                       flag=true;
                       break lab;
                              }
                     else if(p>num)
                               {  
                    	 flag=false;
                    	 break lab;
                            
                                  }
        }                  
        }
        }
           return flag;
    }
    public static void main(String[] args)
    {
 	       powerof2 p = new powerof2();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a number:");
           int n=sc.nextInt();
           sc.close();
           System.out.println("Power of 2: "+p.checkNumber(n));
    }
}
