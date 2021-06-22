package Ranking;
import java.util.Scanner;
public class Ranking {
	private static Scanner sc;
	public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("First Number: ");   int s1 = sc.nextInt();
        System.out.print("Second Number: ");  int s2 = sc.nextInt();
        System.out.print("Third Number: ");   int s3 = sc.nextInt();
       if(s1>s2 && s1>s3 && s2>s3){
           System.out.println("Ranking: "+s1+">"+s2+">"+s3);
       }else if(s1>s2 && s1>s3 && s3>s2){
           System.out.println("Ranking: "+s1+">"+s3+">"+s2);
       }else if(s2>s1 && s2>s1 && s1>s3){
           System.out.println("Ranking: "+s2+">"+s1+">"+s3);
       }else if(s2>s1 && s2>s1 && s3>s1){
           System.out.println("Ranking: "+s2+">"+s3+">"+s1);
       }else if(s3>s1 && s3>s2 && s1>s2){
           System.out.println("Ranking: "+s3+">"+s1+">"+s2);
       }else if(s3>s1 && s3>s2 && s2>s1){
           System.out.println("Ranking: "+s3+">"+s2+">"+s1);
       }
    }
}
