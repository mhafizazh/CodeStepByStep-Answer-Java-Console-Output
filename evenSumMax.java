import java.util.Scanner;
/*
Write a method named evenSumMax that prompts the user for many integers and print the total even sum and maximum of the even numbers. You may assume that the user types at least one non-negative even integer.

how many integers? 4
next integer? 2
next integer? 9
next integer? 18
next integer? 4
even sum = 24
even max = 18
 */
public class evenSumMax {

    static void evenSumMax(){

        int n = 0, even_sum = 0, even_max = 0, integer;

        Scanner scanner = new Scanner(System.in);

        System.out.print("how many integers? ");
        n = scanner.nextInt();

        int i = 0;
        while (i < n) {
            System.out.print("Next integer? ");
            integer = scanner.nextInt();
            i++;
            if(integer %2 ==0){
                even_sum += integer;
                if(even_max < integer)
                    even_max = integer;
            }

        }
        System.out.println("even sum = " + even_sum);
        System.out.println("even max = " + even_max);
    }
    public static void main(String[] args) {
        evenSumMax();


    }
}
