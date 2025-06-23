import java.util.Scanner;
/**
 * This class contains methods
 * for determining a value
 * in the fibonacci sequence.
 *
 * This class was made in tandem with
 * the COMP SCI 200 curriculum.
 *
 * @author James Milgram
 */
public class Fibonacci {
    /**
     * This method calculates the value of
     * the fibonacci sequence at a specified
     * index.
     * @param index An index in the fibonacci sequence
     * @return The value at the specified index
     */
    public static long fibonacci(long index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return (fibonacci(index - 2) + fibonacci (index - 1));
        }
    }

    /**
     * This method prints out the value
     * of the fibonacci sequence at the
     * specified index.
     * @param args unused
     */
    public static void main(String [] args) {
        long idx = 0;
        long fibNum;

        Scanner scnr = new Scanner(System.in);


        System.out.println("What number (ordinal) in the fibonacci sequence do you desire?");
        System.out.println("This program counts 0 at index 0 as the 0th number in the sequence.");

        if (scnr.hasNextLong()) {
            idx = (scnr.nextLong());
        } else {
            System.out.println("Invalid input! Program is exiting!");
            System.exit(1);
        }

        fibNum = fibonacci(idx);

        if (idx % 10 == 1) {
            System.out.printf("The %dst number in the fibonacci sequence is %d", idx, fibNum);
        } else if (idx % 10 == 2) {
            System.out.printf("The %dnd number in the fibonacci sequence is %d", idx, fibNum);
        } else if (idx % 10 == 3) {
            System.out.printf("The %drd number in the fibonacci sequence is %d", idx, fibNum);
        } else {
            System.out.printf("The %dth number in the fibonacci sequence is %d", idx, fibNum);
        }
    }
}

