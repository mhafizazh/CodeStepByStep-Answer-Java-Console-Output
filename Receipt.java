/*The following console program is redundant. Rewrite it to use variables and expressions so that calculations are not repeated.
public class Receipt {
    public static void main(String[] args) {
        // Compute total owed, assuming 8% tax and 15% tip
        System.out.println("Subtotal: " + (38 + 40 + 30));
        System.out.println("Tax: " + (38 + 40 + 30) * .08);
        System.out.println("Tip: " + (38 + 40 + 30) * .15);
        System.out.println("Total: " + (38 + 40 + 30 + (38 + 40 + 30) * .08 + (38 + 40 + 30) * .15));
    }
}
 */
public class Receipt {
    public static void main(String[]args){

        // Declare variables
        int subtotal = 108;
        double taxRate = 0.08;
        double tipRate = 0.15;

        // Calculate total owed using variables and expressions
        double tax = subtotal * taxRate;
        double tip = subtotal * tipRate;
        double total = subtotal + tax + tip;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + tax);
        System.out.println("Tip: " + tip);
        System.out.println("Total: " + total);
    }

}
