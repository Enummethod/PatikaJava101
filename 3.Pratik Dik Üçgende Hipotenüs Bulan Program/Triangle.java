package Triangle;
import java.util.Scanner;
public class Triangle {
	private static Scanner scr;

	public static void main(String[] args) {
		System.out.println("Enter the side lengths of the triangle :");
		
		    int a;
		    int b;
		    int c;
			scr = new Scanner(System.in);
			a = scr.nextInt();
			b = scr.nextInt();
			c =scr.nextInt();
			
		    int u =(a+b+c)/2;
		    double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		    System.out.println("Area of ​​Triangle : " +area);
	
	}
}
