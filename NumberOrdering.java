import java.util.Scanner;
/**
 * This class is used to classify the
 * ordering of four integers.
 *
 * This class was made as a part
 * of the COMP SCI 200 curriculum.
 *
 * @author James Milgram
 */
public class NumberOrdering {
    /**
     * This method returns an integer according to
     * the ordering of the 4 inputted integers.
     * 0 is ascending, 1 is descending, and -1
     * is in no particular order.
     * @param num1 1st number
     * @param num2 2nd number
     * @param num3 3rd number
     * @param num4 4th number
     * @return An integer representing the ordering
     */
    public static int numberOrderer(int num1, int num2, int num3, int num4 ) {
        if ((num1 <= num2) && (num2 <= num3) && (num3 <= num4)) {
            return 0;
        }

        else if ((num1 >= num2) && (num2 >= num3) && (num3 >= num4)) {
            return 1;
        }

        else {
            return -1;
        }
    }

    /**
     * This method prints out
     * the ordering of 4 inputted
     * integers.
     * @param args unused
     */
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Input 4 whole numbers!");

        if (scnr.hasNextInt()) {
            num1 = scnr.nextInt();
        } else {
            System.out.print("Incompatible input! Exiting program!");
            System.exit(1);
        }

        if (scnr.hasNextInt()) {
            num2 = scnr.nextInt();
        } else {
            System.out.print("Incompatible input! Exiting program!");
            System.exit(1);
        }

        if (scnr.hasNextInt()) {
            num3 = scnr.nextInt();
        } else {
            System.out.print("Incompatible input! Exiting program!");
            System.exit(1);
        }

        if (scnr.hasNextInt()) {
            num4 = scnr.nextInt();
        } else {
            System.out.print("Incompatible input! Exiting program!");
            System.exit(1);
        }

        int result = numberOrderer(num1, num2, num3, num4);

        if (result == 0) {
            System.out.print("The numbers are ascending in order!");
        } else if (result == 1) {
            System.out.println("The numbers are descending in order!");
        } else {
            System.out.println("The numbers are not in any order!");
        }
    }
}
