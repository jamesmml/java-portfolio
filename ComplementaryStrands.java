import java.util.Scanner;

/**
 * This class contains a method for
 * evaluating potential DNA/RNA strands.
 *
 * @author James Milgram
 */
public class ComplementaryStrands {

    /**
     * This method executes the logic
     * behind classifying an inputted strand.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System. in);
        String string = "string";
        String newString = "";
        char currentChar;
        char tempChar;
        boolean isValidStrand = true;
        boolean isDNA = true;
        boolean validInput = true;

        if (scnr.hasNextLine()) {
            string = scnr.nextLine();

            int stringLen = string.length();

            for (int i = 0; i < stringLen; ++i) {
                currentChar = string.charAt(i);
                if (currentChar != 'A' && currentChar != 'T' && currentChar != 'G'
                        && currentChar != 'C' && currentChar != 'U') {
                    isValidStrand = false; // Eliminates strands with invalid characters
                    break;
                }
                if (currentChar == 'U') {
                    isDNA = false; // If 'U' present in a strand, then the strand cannot be DNA
                }
                if (!isValidStrand) {
                    break;
                }
                for (int j = 0; j < stringLen; ++j) {
                    tempChar = string.charAt(j);
                    if (currentChar == 'T' && tempChar == 'U') {
                        isValidStrand = false; // Invalid strands have both 'T' and 'U'
                        break;
                    } else if (currentChar == 'U' && tempChar == 'T') {
                        isValidStrand = false; // Invalid strands have both 'U' and 'T'
                        break;
                    }
                }
            }
        } else {
            System.out.println("No input given.");
            validInput = false;
        }

        if (!isValidStrand) {
            System.out.println("Not a valid DNA or RNA strand.");
        } else if (validInput) {
            if (isDNA) {
                int stringLen = string.length();

                for (int i = 0; i < stringLen; ++i) {
                    currentChar = string.charAt(i);
                    switch (currentChar) { // Using Chargaff's Rule
                        case 'A':
                            newString += 'T';
                            break;
                        case 'T':
                            newString += 'A';
                            break;
                        case 'G':
                            newString += 'C';
                            break;
                        default:
                            newString += 'G';
                            break;

                    }
                }
                System.out.println("The complementary DNA strand is:");
                System.out.println(newString);
            } else {
                System.out.println("This is an RNA strand. It does not have a complementary strand :(");
            }

        }
    }
}
