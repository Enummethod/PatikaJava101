package Pratik2Kdv;
import java.util.Scanner;

    public class Pratik2Kdv {
    	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Para Tutarýný gir :");
            float a = sc.nextFloat();
            if(a>0  && a<=1000){
                System.out.println("KDV'siz Fiyat: "+a);
                System.out.println("KDV'li Fiyat: "+(((a*18)/100)+a));
                System.out.println("KDV Tutarý: "+((a*18)/100));
            }
            else if (a>1000){
                System.out.println("KDV'siz Fiyat: "+a);
                System.out.println("KDV'li Fiyat: "+(((a*8)/100)+a));
                System.out.println("KDV Tutarý: "+((a*8)/100));
            }
            
        }
}
