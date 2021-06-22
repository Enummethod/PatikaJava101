package PassState;
import java.util.Scanner;
public class PassState {
	private static Scanner sc;
	public static void main(String[] args) {
	        sc = new Scanner(System.in);
	        float mathAverage = 0,turkishAverage=0,physicsAverage=0,chemistryAverage=0;
	        System.out.println("Enter Math Scores");
	        System.out.print("First Score:");  int n1 = sc.nextInt();
	        System.out.print("Second Score:");  int n2 = sc.nextInt();
	        System.out.print("Third Score:");  int n3 = sc.nextInt();
	        if(n1>0 && n1<100 && n2>0 && n2<100 && n3>0 && n3<100){
	            mathAverage = (n1+n2+n3)/3;
	        }
	        
	        System.out.println("Enter Physics Scores");
	        System.out.print("First Score:");  int f1 = sc.nextInt();
	        System.out.print("Second Score:");  int f2 = sc.nextInt();
	        System.out.print("Third Score:");  int f3 = sc.nextInt();
	        if(f1>0 && f1<100 && f2>0 && f2<100 && f3>0 && f3<100){
	            physicsAverage = (f1+f2+f3)/3;
	        }
	        
	        System.out.println("Enter Turkish Scores");
	        System.out.print("First Score:");  int t1 = sc.nextInt();
	        System.out.print("Second Score:");  int t2 = sc.nextInt();
	        System.out.print("Third Score:");  int t3 = sc.nextInt();
	        if(t1>0 && t1<100 && t2>0 && t2<100 && t3>0 && t3<100){
	            turkishAverage = (t1+t2+t3)/3;
	        }
	        
	        System.out.println("Enter Chemistry Scores");
	        System.out.print("First Score:");  int k1 = sc.nextInt();
	        System.out.print("Second Score:");  int k2 = sc.nextInt();
	        System.out.print("Third Score:");  int k3 = sc.nextInt();
	        if(k1>0 && k1<100 && k2>0 && k2<100 && k3>0 && k3<100){
	            chemistryAverage = (k1+k2+k3)/3;
	        }
	        float generalAverage = (physicsAverage+chemistryAverage+mathAverage+turkishAverage)/4;
	        if (generalAverage>55) {
	            System.out.println("You passed the class.!! Average: "+generalAverage);
	        }else{
	            System.out.println("You failed the class.!! Average: "+generalAverage);
	        }
	    }
}
