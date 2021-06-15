package NotOrtalamasý;
import java.util.Scanner;

public class NotOrtalamasý {

		     private static Scanner sc;

			 public static void main(String[] args) {
			 int maths, physics,chemistry,turkish,history,music;
			 sc = new Scanner(System.in);
			 System.out.println("Enter the math grade: ");
			 maths=sc.nextInt();
			 
			 System.out.println("Enter the  physics grade: ");
			 physics=sc.nextInt();
			 
			 System.out.println("Enter the chemistrygrade: ");
			 chemistry= sc.nextInt();
			 
			 System.out.println("Enter the turkish grade: ");
			 turkish=sc.nextInt();
			 
			 System.out.println("Enter the history grade: ");
			 history=sc.nextInt();
			 
			 System.out.println("Enter the music grade: ");
			 music=sc.nextInt();
			 
			 int total = (maths+physics+chemistry+turkish+history+music);
			 double result=total/6.0;
			 System.out.println("Grade average: "+result);
			  if(result >= 60.0) {
				  System.out.println("You passed the class...");
			  }else {
				  System.out.println("You failed the class...");
			  }
			 

		}

	}
