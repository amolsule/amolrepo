package simple;
import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		
		Scanner inputValue=new Scanner(System.in);
		
		System.out.println("Enter the Marks");
		
		int currentMarks=inputValue.nextInt();
		
		System.out.println(" Marks Are "+currentMarks+"%");
		
		if(currentMarks>=35)
			
		System.out.println("Your are Pass");
		
		else if(currentMarks>=60)
		System.out.println("First Class");
		
		else if(currentMarks>=70)
			System.out.println("Distinction");
		
		else if(currentMarks<35)
			System.out.println("You are Fail");

	}

}
