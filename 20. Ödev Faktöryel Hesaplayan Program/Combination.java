package Combination;
import java.util.Scanner;
public class Combination {
    private static Scanner scanner;
	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("C(n,r) will be defined like this;");
        System.out.print("'n' Enter value: ");
        int n = scanner.nextInt();
        System.out.print("'r' Enter value: ");
        int r = scanner.nextInt();
        int nFaktor = 1, rFaktor = 1, farkFaktor = 1;
        for (int i = 1; i <= n; i++) {
            nFaktor *= i;
        }
        for (int j = 1; j <= r; j++) {
            rFaktor *= j;
        }
        int x = n - r;
        for (int l = 1; l <= x; l++) {
            farkFaktor *= l;
        }
        double C = nFaktor / (rFaktor * (farkFaktor));
        System.out.println("C(" + n + "," + r + ")= " + C);
    }
}
