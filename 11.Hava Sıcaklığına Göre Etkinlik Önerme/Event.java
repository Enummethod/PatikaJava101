package Event;
import java.util.Scanner;
public class Event {
	 private static Scanner sc;

	public static void main(String[] args) {
	        sc = new Scanner(System.in);
	        System.out.print("how many degrees is the temperature ? : ");
	       int temperature = sc.nextInt();
	        if (temperature<=5){
	            System.out.println("Ski");
	        }else if(temperature>5 || temperature<=15){
	            System.out.println("Cinema");
	        }else if(temperature>10 || temperature<=25){
	            System.out.println("Picnic");
	        }else if(temperature>25){
	            System.out.println("swimming");
	        }
	    }
}
