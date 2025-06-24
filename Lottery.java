import java.util.Random;
import java.util.Scanner;

/**
 * This class simulates a lottery-style
 * game.
 *
 * This class was made in tandem with
 * the COMP SCI 200 curriculum.
 *
 * @author James Milgram
 */

public class Lottery {
    /**
     * This method generates 2 random integers (0-9),
     * prompts the user to enter 2 integers (0-9),
     * and prints one's earnings based on one's guesses.
     *
     * @param args unused
     */
    public static void main(String [] args) {
        Random randGen = new Random();
        Scanner scnr = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int randNum1 = randGen.nextInt(10);
        int randNum2 = randGen.nextInt(10);

        System.out.println("Guess 2 whole numbers (0-9)!");

        if (scnr.hasNextInt()) {
            num1 = scnr.nextInt();
        } else {
            System.out.println("Invalid guess! Program exiting!");
            System.exit(1);
        }

        if (scnr.hasNextInt()) {
            num2 = scnr.nextInt();
        } else {
            System.out.println("Invalid guess! Program exiting!");
            System.exit(1);
        }

        if (num1 == randNum1 && num2 == randNum2) {
            System.out.println("You won $5000!");
            System.out.print("The numbers were: " + randNum1 + " ");
            System.out.println(randNum2);
        } else if (num1 == randNum2 && num2 == randNum1) {
            System.out.println("You won $3000!");
            System.out.print("The numbers were: " + randNum1 + " ");
            System.out.println(randNum2);
        } else if (num1 == randNum1 || num1 == randNum2) {
            System.out.println("You won $1000!");
            System.out.print("The numbers were: " + randNum1 + " ");
            System.out.println(randNum2);
        } else if (num2 == randNum2 || num2 == randNum1) {
            System.out.println("You won $1000!");
            System.out.print("The numbers were: " + randNum1 + " ");
            System.out.println(randNum2);
        } else {
            System.out.println("You did not win. Try again!");
            System.out.print("The numbers were: " + randNum1 + " ");
            System.out.println(randNum2);
        }

    }
}
