package circle;
import java.util.Scanner;
public class circle {
	static final double PI = 3.14;
	private static Scanner sc;
    public static double areaCalculation(int radius){
        double result = PI*(Math.pow(radius, 2));
        return result;
    };
    public static double perimeterCalculation(int radius){
        double result = 2*PI*radius;
        return result;
    };
    public static double sliceCalculation (int radius,double angle){
        double result = (PI*(Math.pow(radius, 2))*angle)/360;
        return result;
    };

    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter radius :");
        int radius = sc.nextInt();
        System.out.print("Enter angle :");
        double angle = sc.nextDouble();
        System.out.println("Area : "+ areaCalculation(radius));
        System.out.println("Perimeter : "+perimeterCalculation(radius));
        System.out.println("Slice : "+ sliceCalculation(radius, angle));
    }

}
