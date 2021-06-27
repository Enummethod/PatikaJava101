package ATM;
import java.util.Scanner;
public class ATM {
	 private static Scanner sc;
	public static void main(String[] args) {
         sc = new Scanner(System.in);
         int balance = 1000;
        System.out.println("Your Balance = " + balance);
        System.out.println("\n****EMBROIDERIES****\n");
        System.out.println("Withdraw money for 1");
        System.out.println("To Deposit Money for 2");
        System.out.println("Balance Inquiry for 3");
        System.out.println("Return Credit Card for 4");
        System.out.print("Select the action :");
        int action = sc.nextInt();
        switch(action) {
        case 1:
            System.out.println("Your Balance = " + balance);
            System.out.print("The amount you want to withdraw: ");
            int tutar = sc.nextInt();
            if(tutar > balance) {
                System.out.print("Insufficient balance.Re-enter value: ");
                tutar = sc.nextInt();
            }
            balance -= tutar;
            System.out.println("Your new Balance = " + balance);
            break;
        case 2:
            System.out.println("Your Balance = " + balance);
            System.out.print("The amount you want to withdraw: ");
            tutar = sc.nextInt();
            balance += tutar;
            System.out.println("Your new Balance = " + balance);
            break;
        case 3:
            System.out.println("Your Balance = " + balance);
            break;
        case 4:
            System.out.println("Don't forget to take your credit card.!!");
        default:
            System.out.println("Incorrect entry. Re-enter value.");
        }
    }

}
