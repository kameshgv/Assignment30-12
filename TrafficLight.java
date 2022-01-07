package Assignment30;
import java.util.Scanner;

public class TrafficLight {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("select the light  red or yellow or green ");
	    String light=sc.nextLine();
	     sc.close();
	   switch(light)
	    {
	    case"red":
	    	System.out.println("STOP");
	    	break;
	    case"yellow":
	    	System.out.println("READY");
	    	break;
	    case"green":
	    	System.out.println("GO");
	    	break;
	   
	    }
}
}

