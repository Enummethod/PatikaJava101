package StepValue;
import java.util.Scanner;
public class StepValue {
	private static Scanner sc;
	public static void main(String[] args) {
	        int number,sum=0;
	        sc = new Scanner(System.in);
	        System.out.println("Enter Number:");
	        number= sc.nextInt();
	        while (number > 0) {
	            sum = sum + number % 10;
	            number = number / 10;
	        }
	        System.out.println(sum);
    }
}

