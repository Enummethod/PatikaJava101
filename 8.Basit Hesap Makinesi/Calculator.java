package Calculator;
import java.util.Scanner;
public class Calculator {
	    private static Scanner scan;

		public static void main(String[] args) {
	        double n1, n2;
	        int choosen;
	        scan = new Scanner(System.in);
	        System.out.print("�lk Say�y� Giriniz :");
	        n1 = scan.nextDouble();
	        System.out.print("�kinci Say�y� Giriniz :");
	        n2 = scan.nextDouble();
	        System.out.println("Yap�lacak ��lemi Se�iniz :\n 1)Toplama\n 2)��karma\n 3)B�lme\n 4)�arpma");
	        choosen = scan.nextInt();

	        switch (choosen) {
	            case 1:
	                System.out.println("Toplama ��leminin Sonucu : " + (n1 + n2));
	                break;
	            case 2:
	                System.out.println("��karma ��leminin Sonucu : " + (n1 - n2));
	                break;
	            case 3:
	                System.out.println("B�lme ��leminin Sonucu : " + (n1 / n2));
	                break;
	            case 4:
	                System.out.println("�arpma ��leminin Sonucu : " + (n1 * n2));
	                break;

	        }
	    }
	}
