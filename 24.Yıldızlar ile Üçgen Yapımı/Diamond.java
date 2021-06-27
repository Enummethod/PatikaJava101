package Diamond;
import java.util.Scanner;
public class Diamond {
	private static Scanner scanner;
	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int k = 0; k < (number - i); k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int a = number - 1; a >= 1; a--) {
            for (int b = number - a - 1 ; b >= 0; b--) {
                System.out.print(" ");
            }

            for (int c=(2*a-1); c>=1;c--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
