package simple;
import java.util.Scanner;

public class Simple1 {

	public static void main(String [] args) {
		
		Scanner inputValue=new Scanner(System.in);
		
		System.out.println("Enter the signal status");
		
		String currentStateofSignal=inputValue.nextLine();
		
		
		System.out.println("State of signal is "+ currentStateofSignal);
		
	
		if(currentStateofSignal.equals("GREEN"))
		{
			System.out.println("Go");
		}
		else if(currentStateofSignal.contentEquals("RED"))
		{
			System.out.println("Stop");
		}
		else if(currentStateofSignal.contentEquals("ORANGE"))
		{
			System.out.println("Wait for White");
		}
		
		                                     }
				

	

}
