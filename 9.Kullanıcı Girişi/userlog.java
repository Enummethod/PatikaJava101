package UserLogin;
import java.util.Scanner;

public class userlog {
	        private static Scanner scan;
			public static void main(String[] args) {
	        scan = new Scanner(System.in);
	        String username, password;
	        System.out.println("Kullan�c� Ad� : ");
	        username = scan.nextLine();
	        System.out.println("�ifreniz :");
	        password = scan.nextLine();
	        if(username.equals("admin")&& password.equals("admin")){
	            System.out.println("Giri� Ba�ar�l�");

	        }else{
	            System.out.println("Kullan�c� Ad� veya �ifre yanl��!");

	        }
	    }
	}