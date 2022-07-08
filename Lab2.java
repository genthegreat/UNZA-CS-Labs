public class Lab2{
	public static void main(String[] args){
		// This program estimates PI

		// Assign Variables
		double centerX = 0;
		double centerY = 0;
		double radius = 1;
		double squareArea = 4.0;
		int numberOfHits = 0;
		
		// Print the Areas to screen	
		System.out.println("Area of the circle is " + circleArea);
		System.out.println("Area of the square is " + squareArea);
				
		System.out.println();
		System.out.println();

		// Generate 1,000,000 random positions using a loop
		for(int i=0; i<1000000; i++){	
			
			// Choose random distances from the center for both the X and Y co-ordinates
			double cartesianX = centerX + (double)(Math.random() * (radius - centerX));
			double cartesianY = centerY + (double)(Math.random() * (radius - centerY));
			
			// Assume the point is a rectangle and calculate it's Area
			double randomArea = (cartesianX + cartesianX) * (cartesianY + cartesianY);		
			
			// Compare the area and if it is less or equal to the circle area
			if(randomArea <= circleArea){
				numberOfHits = numberOfHits + 1;
			} else{
				}
			
		}
		
		// Print out the number of hits
		System.out.println(numberOfHits);
		double probability = 4.00 * numberOfHits/1000000;
		
		
		System.out.println("The probability of a random point being within the circle is: " + probability);



	}
}