import java.util.Scanner;
/**
 * This class identifies tax rate
 * for a given income and
 * calculates the tax according to
 * the U.S. 1913 tax rates.
 *
 * This class was made as a part
 * of the COMP SCI 200 curriculum.
 *
 * @author James Milgram
 */
public class TaxRates {
    /**
     * This method calculates one's tax and
     * net income.
     * @param args unused
     */
    public static void main(String [] args) {
        double income;
        double taxRate;
        double tax;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Input your income ($)");

        String incomeString = scnr.next();

        int idx = incomeString.indexOf("$");

        if (idx != -1) {
            incomeString = incomeString.substring(idx+1);
            income = Double.parseDouble(incomeString);
        } else {
            income = Double.parseDouble(incomeString);
        }

        if (income < 0) {
            System.out.println("Invalid income! Exiting program!");
            System.exit(1);
        }

        if (income > 500000) {
            taxRate = 0.07;
            tax = income * taxRate;
            income -= tax;
            System.out.println("Tax Rate: 7%");
            System.out.printf("Tax: $ %.2f\n", tax);
            System.out.printf("Net Income: $%.2f", income);
        } else if (income > 250000) {
            taxRate = 0.06;
            tax = income * taxRate;
            income -= tax;
            System.out.println("Tax Rate: 6%");
            System.out.printf("Tax: $ %.2f\n", tax);
            System.out.printf("Net Income: $%.2f", income);
        } else if (income > 100000) {
            taxRate = 0.05;
            tax = income * taxRate;
            income -= tax;
            System.out.println("Tax Rate: 5%");
            System.out.printf("Tax: $ %.2f\n", tax);
            System.out.printf("Net Income: $%.2f", income);
        } else if (income > 75000) {
            taxRate = 0.04;
            tax = income * taxRate;
            income -= tax;
            System.out.println("Tax Rate: 4%");
            System.out.printf("Tax: $ %.2f\n", tax);
            System.out.printf("Net Income: $%.2f", income);
        } else if (income > 50000) {
            taxRate = 0.03;
            tax = income * taxRate;
            income -= tax;
            System.out.println("Tax Rate: 3%");
            System.out.printf("Tax: $ %.2f\n", tax);
            System.out.printf("Net Income: $%.2f", income);
        } else if (income > 20000) {
            taxRate = 0.02;
            tax = income * taxRate;
            income -= tax;
            System.out.println("Tax Rate: 2%");
            System.out.printf("Tax: $ %.2f\n", tax);
            System.out.printf("Net Income: $%.2f", income);
        } else if (income >= 0) {
            taxRate = 0.01;
            tax = income * taxRate;
            income -= tax;
            System.out.println("Tax Rate: 1%");
            System.out.printf("Tax: $ %.2f\n", tax);
            System.out.printf("Net Income: $%.2f", income);
        }


    }
}

