package circle;
import java.util.Scanner;
public class Circle {
	static final float PI = 3.14f;
	private static Scanner sc;
    public static float areaCalculation(int radius){
        float result = PI*(radius^2);
        return result;
    };
    public static float perimeterCalculation(int radius){
        float result = 2*PI*radius;
        return result;
    };
    public static float sliceCalculation (int radius,float angle){
        float result = (PI*(radius^2)*angle)/360;
        return result;
    };

    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter radius :");
        int radius = sc.nextInt();
        System.out.print("Enter angle :");
        float angle = sc.nextFloat();
        System.out.println("Area : "+ areaCalculation(radius));
        System.out.println("Environmental : "+perimeterCalculation(radius));
        System.out.println("Slice : "+ sliceCalculation(radius, angle));
        
    }

}
