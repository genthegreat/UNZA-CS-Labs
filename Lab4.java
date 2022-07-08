import java.util.Scanner; // import Scanner method

public class Lab4{  // This program calculates the power of a number without using so much code

  public static boolean isEven(int b){ // This method checks whether the power is even
	return (b%2) == 0;
  }

  public static int exponent(boolean c, int a, int b, int result){ //This method calculates the result

	if(c){ // if the value returned from the check(c) is true then it divides and conquers
		b = b/2;
		int evenResult = (int)(Math.pow(a,b));
		evenResult = (int)(Math.pow(evenResult,2));
		result = result * evenResult;
		return result;
	} else{ // if the value returned from the check is false it subtracts one from the power and recalls it's method
		b = b-1;
		result = a;
		return exponent(true, a, b, result);
	}

  }

  public static void main(String args[]){
	
	// Ask for input from user
	System.out.println("This program calculates a^b, given 'a' and 'b'!");
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the value of the base: ");
	int a = input.nextInt();
	System.out.print("Enter the value of the power: ");
	int b = input.nextInt();
	
	int result = 1;

	//call the isEven method
	boolean check = isEven(b);
	
	//call the exponent method
	result = exponent(check, a, b, result);
	
	//Print result
	System.out.println(result);


  }

}
 
