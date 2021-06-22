package Zodiac;
import java.util.Scanner;
public class Zodiac {
	private static Scanner sc;
	public static void main(String[] args) { 
	 sc = new Scanner(System.in);
	 System.out.print("Enter Month of Birth:");
	 String month = sc.nextLine();
	 System.out.print("Enter Day of Birth :");
	 int day= sc.nextInt();
	 switch(month) {
	  case "January","january","JANUARY","Ocak","ocak","OCAK":
	    if(day<=20){
	    	System.out.println("Your horoscope Capricorn.");
	    }
	    else 
	    {
	    	System.out.println("Your horoscope Aquarius.");
	    }
	    break;
	  case "february","February","FEBRUARY","ÞUBAT","þubat","Þubat":
		    if(day<=18){
		    	System.out.println("Your horoscope is Aquarius.");
		    }
		    else 
		    {
		    	System.out.println("Your horoscope is Pisces.");
		    }
		    break;
	  case "March","march","MARCH","MART","Mart","mart":
		    if(day<=20){
		    	System.out.println("Your horoscope is Pisces.");
		    }
		    else 
		    {
		    	System.out.println("Your horoscope is Aries.");
		    }
		    break;
	  case "april","April","APRÝL","Nisan","nisan","NÝSAN":
		    if(day<=20){
		    	System.out.println("Your horoscope is Aries.");
		    }
		    else 
		    {
		    	System.out.println("Your horoscope is Taurus.");
		    }
		    break;
	  case "may","May","MAY","MAYIS","Mayýs","mayýs":
		    if(day<=20){
		    	System.out.println("Your horoscope is Taurus.");
		    }
		    else 
		    {
		    	System.out.println("Your horoscope is Gemini.");
		    }
		    break;
	  case "JUNE","June","june","haziran","Haziran", "HAZÝRAN":
		    if(day<=21){
		    	System.out.println("Your horoscope is Gemini.");
		    }
		    else 
		    {
		    	System.out.println("Your horoscope is Cancer.");
		    }
		    break;
	  case "july","July","JULY","temmuz","TEMMUZ","Temmuz":
		    if(day<=22){
		    	System.out.println("Your horoscope is Cancer.");
		    }
		    else 
		    {
		    	System.out.println("Your horoscope is Leo.");
		    }
		    break;
	  case "aðustos","AÐUSTOS","Aðustos","august","August","AUGUST":
		    if(day<=22){
		    	System.out.println("Your horoscope is Leo.");
		    }
		    else 
		    {
		    	System.out.println("Your horoscope is Virgo.");
		    }
		    break;
	  case "eylül","Eylül","EYLÜL","September","september","SEPTEMBER":
		    if(day<=22){
		    	System.out.println("Your horoscope is Virgo.");
		    }
		    else 
		    {
		    	System.out.println("Your horoscope is Libra.");
		    }
		    break;
	  case "ekim","EKÝM","Ekim","October","october","OTOBER ":
		    if(day<=23){
		    	System.out.println("Your horoscope is Libra.");
		    }
		    else 
		    {
		    	System.out.println("Your horoscope is Scorpio.");
		    }
		    break;
	  case "November","november","NOVEMBER","KASIM","Kasým","kasým":
		    if(day<=22){
		    	System.out.println("Your horoscope is Scorpio.");
		    }
		    else 
		    {
		    	System.out.println("Your horoscope is Sagittarius.");
		    }
		    break;
	  case "aralýk","Aralýk","ARALIK","December","december","DECEMBER" :
		    if(day<=21){
		    	System.out.println("Your horoscope is Sagittarius.");
		    }
		    else 
		    {
		    	System.out.println("Your horoscope is Aquarius.");
		    }
		    break;
	  default:
	} 
  }
	 
}
