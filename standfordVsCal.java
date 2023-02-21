import java.util.Scanner;
public class standfordVsCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Stanford: How many points did they score?");
        int standford = scanner.nextInt();

        System.out.print("Cal: How many points did they score?");
        int cal = scanner.nextInt();

        if (standford > cal){
            System.out.println("Stanford won!");
        } else {
            System.out.println("Berkley won!");
        }
    }
}
