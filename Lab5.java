import java.util.Scanner; // import scanner

public class Lab5{
  public static void main(String[] args){

	// Create the parallel arrays
	String[] names = {"John Sibeso", "Jack Phiri", "Jane Banda", "Kalumbi Bwalya"};
	int[] computerNo = {1, 2, 3, 4};
	int[] chemistry = {45, 56, 98, 76};
	int[] physics = {54, 65, 67, 33};
	int[] mathematics = {45, 78, 43, 58};
	int[] biology = {54, 89, 45, 82};

	// Describe the total variable for all subjects
	double totalChem = 0;
	double totalPhy = 0;
	double totalMath = 0;
	double totalBio = 0;
	
	System.out.printf("%-20s%-12s%-12s%-12s%-12s%-12s\n", "Name", "computerNo", "chemistry", "physics", "mathematics", "biology");

	for( int i = 0; i < names.length; i++){
		System.out.printf("%-20s%-12d%-12d%-12d%-12d%-12d\n", names[i], computerNo[i], chemistry[i], physics[i], mathematics[i], biology[i]);
		totalChem += chemistry[i];
		totalPhy += physics[i];
		totalMath += mathematics[i];
		totalBio += biology[i];
	}

	System.out.println("");
	System.out.println("");

	int averageC = (int)(totalChem / names.length);
	int averageP = (int)(totalPhy / names.length);
	int averageM = (int)(totalMath / names.length);
	int averageB = (int)(totalBio / names.length);

	System.out.printf("Average of Chem, Phy, Math, Bio is: %-4d %-4d %-4d %-4d   Respectively", averageC, averageP, averageM, averageB);
	System.out.println("");

	// Ask for user input
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the Students Computer Number: ");
	int selected = input.nextInt();
	System.out.println("");


	System.out.println("Name: " + names[selected-1]);
	System.out.println("=======================================");
	System.out.printf("%-20s%-20s%-20s\n", "Subject", "Score", "Comment");
	System.out.printf("%-20s%-20d%-20s\n", "Chemistry", chemistry[selected-1] , average(chemistry[selected-1], averageC));
	System.out.printf("%-20s%-20d%-20s\n", "Physics", physics[selected-1] , average(physics[selected-1], averageP));
	System.out.printf("%-20s%-20d%-20s\n", "Mathematics", mathematics[selected-1] , average(mathematics[selected-1], averageM));
	System.out.printf("%-20s%-20d%-20s\n", "Biology", chemistry[selected-1] , average(biology[selected-1], averageB));


}


// THIS METHOD CHECKS WHETHER THE SCORE IS ABOVE AVERAGE
  public static String average(int a,int average){
	String result;
	if(a > average){
		result = "Above Average";
		return result;
	}else if(a == average){
		result = "Average";
		return result;
	}else {
		result = "Below Average";
		return result;
	}
  }
}