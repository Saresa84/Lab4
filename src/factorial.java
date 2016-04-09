import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		//title
		System.out.println("Welcome to the Factorial Calculator!" + "\n");
		
		//open scanner
		Scanner input = new Scanner(System.in);
		
		//check to go again
		String keepGoing = "y";
		while (keepGoing.equalsIgnoreCase("y")){
		//get number from user to factorial for
		System.out.print("Enter an integer that's greater than 0 but less than 10: ");
		int number = input.nextInt();
		input.nextLine();
		long factorial= number;
		int constant = 1;
		for (int i=1; number >i; i++){
			
			factorial = factorial * constant;
			constant ++;
		}
		//print results
		System.out.println("The factorial of "+ number + " is " + factorial + "." + "\n");
		
		//prompt to go again
		System.out.print("Continue y/n? ");
		keepGoing = input.next();
		}
		input.close();
	}

}
