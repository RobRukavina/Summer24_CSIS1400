import java.util.Scanner;
import java.lang.Math;     // Note: Needed for math functions in part (3)

public class PaintEstimator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final double GAL_SQUARE_FEET = 350;
      double wallHeight;
      double wallWidth;
      double wallArea;
      double gallonsNeeded;
      
      System.out.println("Enter wall height (feet):");
      wallHeight = scnr.nextDouble();
      
      System.out.println("Enter wall width (feet):");
      wallWidth = scnr.nextDouble();
   
      wallArea = wallWidth * wallHeight;
      System.out.printf("Wall area: %.2f\n", wallArea);
         
      gallonsNeeded = wallArea / GAL_SQUARE_FEET;
      System.out.printf("Gallons of paint needed: %.2f\n", gallonsNeeded);
      
      System.out.printf("We will need: " + (int)Math.ceil(gallonsNeeded) + " one gallon cans of paint!");
   }
}