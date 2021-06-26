package ExponentialNumbersFor;

import java.util.Scanner;

public class ExponentialNumbersFor {
    public static void main(String[] args) {
        {
            Scanner sc= new Scanner(System.in);
            System.out.print("Number : ");
            int number=sc.nextInt();

            System.out.print("Exp:");
            int pow=sc.nextInt();

            int total=1;

            for (int i=0; i<pow;i++){
                total*=number;
            }
            System.out.print("Result: " + total);}
    }
}
