/*Write an interactive console program in a class named InchesToCentimeters that prompts the user to read in two input values: a number of feet, followed on a separate line by a number of inches. The program should convert this amount to centimeters. Here is a sample run of the program (user input is shown like this):

        This program converts feet and inches to centimeters.
        Enter number of feet: 5
        Enter number of inches: 11
        5ft 11in = 180.34cm
*/
import java.util.Scanner;
public class InchesToCentimeters {
    public static void main(String[]args){

        System.out.println("This program converts feet and inches to centimeters.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of feet: ");
        int feet = scanner.nextInt();

        System.out.print("Enter number of inches: ");
        int inches = scanner.nextInt();

        double fttocm = feet * 30.48;
        double inctocm = inches * 2.54;

        double cm = fttocm + inctocm;

        System.out.println(feet + "ft " + inches + "in = " + cm + "cm");


    }
}
