package myProjects;
import java.util.Scanner;

public class Double_Factorial_App {
	
	// recursively computes the double factorial of n
	public static long doubleFactorial(int n) {
		if (n <= 1) return 1;
		return n * doubleFactorial(n - 2);
	}
	
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		int n = -1;
		
		while (true) {
			System.out.print("Enter an integer (1-20): ");
			
			// Checks that the input is an integer
			if (!userinput.hasNextInt()) {
				System.out.println("Invalid input, must be an integer. Try again.");
				userinput.next();
				continue;
			}
			
			n = userinput.nextInt();
			
			// Checks possible errors until the valid input
			if (n < 1) {
				System.out.println("Invalid input, number must be positive. Try again.");
			} else if (n >= 20) {
				System.out.println("Invalid input, number must be less than 20. Try again.");
			} else {
				break;
			}
		}
		
		// Compute and print the result
		System.out.println(n + "!! = " + doubleFactorial(n));
		userinput.close();
	}
}
