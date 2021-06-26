package HarmonicSeries;
import java.util.Scanner;
public class HarmonicSeries {
    private static Scanner sc;
	public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        double result = 0,j,i;

        for (i = 1; i <= number; i++) {
            j=1/i;
            result+=j;
        }
        System.out.println("Harmonic\n"
        		+ "series : "+result);
    }
}
