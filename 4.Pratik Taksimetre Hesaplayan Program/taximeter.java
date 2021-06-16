package taximeter;
import java.util.Scanner;

public class taximeter {
	private static Scanner sc;

	public static float priceCalculation(float km)
	{
	    float openingFee = (float) 10.0;
	    float price = (float) (km*2.20);
	    float finalFee = price + openingFee;
	    if(finalFee<=20)
	    {
	    return (float) 20.0;
	    }
	    return finalFee;
	}
	    public static void main(String[] args) {
	        sc = new Scanner(System.in);
	        System.out.print("Gidilecek Uzaklık(Km): ");
	        float km = sc.nextFloat();
	        float price = priceCalculation(km);
	        System.out.println(price+" ₺");
    }
}