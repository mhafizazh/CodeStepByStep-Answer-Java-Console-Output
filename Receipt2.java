/* The following console program always computes the same output. Modify it to be an interactive program that prompts the user to enter the meal cost as shown and computes the rest of the values based on that meal cost. Here are two example logs of execution:

What was the meal cost? $50
Subtotal: 50
Tax: 4.0
Tip: 7.5
Total: 61.5
What was the meal cost? $125
Subtotal: 125
Tax: 10.0
Tip: 18.75
Total: 153.75
*/

import java.util.Scanner;
public class Receipt2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What was the meal cost? $");
        int subtotal = scanner.nextInt();

        // Calculate total owed, assuming 8% tax / 15% tip
        double tax = subtotal * .08;
        double tip = subtotal * .15;
        double total = subtotal + tax + tip;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + tax);
        System.out.println("Tip: " + tip);
        System.out.println("Total: " + total);



    }
}
