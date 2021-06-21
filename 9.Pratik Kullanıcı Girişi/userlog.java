package UserLogin;
import java.util.Scanner;

public class userlog {
	        private static Scanner scan;
			public static void main(String[] args) {
	        scan = new Scanner(System.in);
	        String username, password;
	        System.out.println("Kullanýcý Adý : ");
	        username = scan.nextLine();
	        System.out.println("Þifreniz :");
	        password = scan.nextLine();
	        if(username.equals("admin")&& password.equals("admin")){
	            System.out.println("Giriþ Baþarýlý");

	        }else{
	            System.out.println("Kullanýcý Adý veya Þifre yanlýþ!");

	        }
	    }
	}