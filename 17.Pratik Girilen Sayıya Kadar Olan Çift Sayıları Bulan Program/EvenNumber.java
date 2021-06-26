package EvenNumber;
import java.util.Scanner; 
public class EvenNumber {
	    private static Scanner sc;
		public static void main(String[] args) {
	    sc = new Scanner(System.in);
	    System.out.println("Enter Number:"); int number = sc.nextInt();
	    int 
	    divisibleBy3=0,divisibleBy4=0,counter1=0,counter2=0;
	    for(int i=0;i<=number;i++){
	            if(i%3 == 0){
	               divisibleBy3 += i;
	               counter1++;
	            }
	            if(i%4 == 0){
	                divisibleBy4 +=i;
	                counter2++;
	            }
	        }
	        int average = (divisibleBy3+divisibleBy4)/(counter1+counter2);
	        System.out.println("Ortlama: "+average);
	    }
}
