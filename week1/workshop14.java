package week1;
import java.util.Scanner;
public class workshop14 {
	    public static void main(String[] args) {
	      
	        Scanner scanner = new Scanner(System.in);


	        System.out.print("Enter the amount in U.S. dollars: ");
	        double usdAmount = scanner.nextDouble();

	  
	        System.out.print("Enter the exchange rate (1 USD to target currency): ");
	        double exchangeRate = scanner.nextDouble();

	       
	        double convertedAmount = usdAmount * exchangeRate;

	        System.out.println("The converted amount is: " + convertedAmount);


	        scanner.close();
	    }
	}



