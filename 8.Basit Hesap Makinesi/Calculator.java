package Calculator;
import java.util.Scanner;
public class Calculator {
	    private static Scanner scan;

		public static void main(String[] args) {
	        double n1, n2;
	        int choosen;
	        scan = new Scanner(System.in);
	        System.out.print("Ýlk Sayýyý Giriniz :");
	        n1 = scan.nextDouble();
	        System.out.print("Ýkinci Sayýyý Giriniz :");
	        n2 = scan.nextDouble();
	        System.out.println("Yapýlacak Ýþlemi Seçiniz :\n 1)Toplama\n 2)Çýkarma\n 3)Bölme\n 4)Çarpma");
	        choosen = scan.nextInt();

	        switch (choosen) {
	            case 1:
	                System.out.println("Toplama Ýþleminin Sonucu : " + (n1 + n2));
	                break;
	            case 2:
	                System.out.println("Çýkarma Ýþleminin Sonucu : " + (n1 - n2));
	                break;
	            case 3:
	                System.out.println("Bölme Ýþleminin Sonucu : " + (n1 / n2));
	                break;
	            case 4:
	                System.out.println("Çarpma Ýþleminin Sonucu : " + (n1 * n2));
	                break;

	        }
	    }
	}
