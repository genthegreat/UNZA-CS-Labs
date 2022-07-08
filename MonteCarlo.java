/* * * * * * * * * * * * * * * * * * * * * * * * * * * 
*                                                    *
*             NAME: CHUNGU CHAMA                     *
* * * * * * * * * * * * * * * * * * * * * * * *  * * */

import java.util.*;  // Importation of the Scanner class.

/*_______________________________________________________*/
  public class MonteCarlo{  //Intiation of the main method
   public static void main(String [] args){
    double CircleArea = Math.PI;
    int SquareArea = 4;
    double radius = 1;
    double numberOfHits = 0;
    double numberOfTrials = 0;
    /*..........................................................
    ............................................................
    DECLARATION OF THE VARIBLES TO BE USED FOR THE CIRCLE
    ...........................................................*/

   double x1 = 0;
   double x2 = Math.random();
   double y1 = 0;
   double y2 = Math.random();
   double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
   
   for(int i = 0; i<1000000; i++){
    numberOfHits++; 
   while(numberOfHits <= radius && d <= 1){
    d = numberOfHits;
    numberOfHits =(int)1000000 * Math.PI/4;
System.out.println("The number of hits is: " + numberOfHits); 
System.out.println("The value of PI is: " + (4 * numberOfHits /1000000));
      }
  }
}
}   


   