import java.util.Random;
import java.util.Scanner; // This should not be here unless it is being used in the code. won't throw an error, but it's bad practice.

public class Errors {

    public static void main (String [] args) {
    // Random randGen = new Random();
        // int songNum;
        // int numDays; int numYears; numDays = numYears * 365;
        // int amountOwed =- 999;
        // songNum = 5;

        // System.out.println("Num: " + songnum);

        // System.out.println(int songNum);

        //System.out.println(randGen.nextInt(13)+18);

    char letter1;

    char letter2;

 

    letter1 = 'y';

    while (letter1 <= 'z') {

        letter2 = 'a';

        while (letter2 <= 'c') {

            System.out.print("" + letter1 + letter2 + " ");

            ++letter2;

        }

        ++letter1;

    }
        
    }

}