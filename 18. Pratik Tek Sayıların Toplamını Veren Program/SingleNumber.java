package SingleNumber;
import java.util.Scanner;
public class SingleNumber {
	    private static Scanner sc;
		private static int total;
		public static void main(String[] args) {
	         sc = new Scanner(System.in);
	        total = 0;
	        int number;
	        do {
	            System.out.println("Enter number: "); number= sc.nextInt();
	            if(number%2 == 0 && number%4 == 0){
	                total += number;
	            }
	        } while (number%2==0);
	        System.out.println("Total : "+total);
	    }
	}
