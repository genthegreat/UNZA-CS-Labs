import java.util.Scanner; // import Scanner method

public class SearchEngine{
 public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter text to be searched");
	String words = input.nextLine();

	System.out.println("What word are you looking for");
	String sentence1 = input.nextLine();

	System.out.println("What other word are you looking for");
	String sentence2 = input.nextLine();

	System.out.println("");
	System.out.println("");
	System.out.println("");

	int fromIndex1 = 0;
	int fromIndex2 = 0;
	int countw1 = 0;
	int countw2 = 0;
	
	while ((fromIndex1 = sentence1.indexOf(words, fromIndex1)) != -1){
		countw1++ ;
		fromIndex1 += words.length();
		}
	while ((fromIndex2 = sentence2.indexOf(words, fromIndex2)) != -1) {
		countw2++ ;
		fromIndex2 += words.length();
	}
	// This part is correct
	System.out.println("The words entered occur");
	System.out.printf("%-20s%-20s\n", "word", "occurence" );
	
	if (countw2 >= countw1){
		//Print 2 before 1
		System.out.printf("%-20s%-20d\n", sentence2, countw2);
		System.out.printf("%-20s%-20d\n", sentence1, countw1);
	}else {
		System.out.printf("%-20s%-20d\n", sentence1, countw1);
		System.out.printf("%-20s%-20d\n", sentence2, countw2);
	}





 }
}