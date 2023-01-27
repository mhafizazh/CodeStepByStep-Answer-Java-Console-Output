/*Write an interactive console program in a class named CalculateLine that calculates y coordinates on a line. First, it prompts the user for a slope m, and an intercept b (as seen in the line equation of the form y = m x + b). Then the program prompts the user for x values until the user enters a -1. For each entered number, print the y value on that line for that entered x value. Here is a sample run of the program (user input is shown like this):

        This program calculates y coordinates for a line.
        Enter slope (m): 2
        Enter intercept (b): 4
        Enter x: 5
        f(5) = 14
        Enter x: 1
        f(1) = 6
        Enter x: -1
import java.util.Scanner;

 */
import java.util.Scanner;
public class CalculateLine {
    public static void main(String[] args){

        System.out.println("This program calculates y coordinates for a line.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter slope (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter intercept (b): ");
        int b = scanner.nextInt();

        do{
            System.out.print("Enter x: ");
            int x = scanner.nextInt();

            if(x==-1)
                break;
            System.out.println("f(" + x + ") = " + (m*x+b));
        }while (true);


    }
}