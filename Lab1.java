import java.util.Scanner; // import Scanner method

public class Lab1{
	public static void main(String[] args){
		// This Programme calculates the roots of a quadratic equation

		Scanner input = new Scanner(System.in);

		System.out.println("This Programme calculates the roots of a quadratic equation");

		//Collect input on the values of a, b and c
		System.out.print("What is the value of a? ");
		int a = input.nextInt();

		System.out.print("What is the value of b? ");
		int b = input.nextInt();

		System.out.print("What is the value of c? ");
		int c = input.nextInt();
		
		// Calculate what is in the square root
		double innerRoot = b * b - 4 * a * c ;

		// define the square root
		double squareRoot = Math.pow(innerRoot,0.5);

		// Calculate the Numerator		
		double numeratorPositive = -b + squareRoot;
		double numeratorNegative = -b - squareRoot;

		// Calculate the Denominator
		double denominator = 2 * a;

		// Calculate the roots
		double rootA = numeratorPositive / denominator;
		double rootB = numeratorNegative / denominator;

		System.out.print("The roots of the quadratic equation are " + rootA + " and " + rootB);
	}
}