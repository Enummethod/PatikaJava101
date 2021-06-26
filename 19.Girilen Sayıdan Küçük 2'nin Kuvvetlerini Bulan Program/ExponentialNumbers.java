package ExponentialNumbers;
import java.util.Scanner;
public class ExponentialNumbers {
	private static Scanner sc;
	public static void main(String[] args) {  
		        sc = new Scanner(System.in);
		        System.out.println("Enter Number: ");
		        int number = sc.nextInt();
		        for(int i=1;i<=number;i++){
		            System.out.println("base of 4 :"+Math.pow(i, 4));
		            System.out.print("base of 5 : "+Math.pow(i, 5));
		            System.out.println("");
		        }
		    }
	}
