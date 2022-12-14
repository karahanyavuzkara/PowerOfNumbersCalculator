package patika;
import java.util.Scanner;
public class PowerofNumbersCalculator {

	public static void main (String[]args) {
		
		int n,k;
		System.out.print("Enter the base number : ");
		Scanner input = new Scanner(System.in);
		
		   n = input.nextInt();
		   
		System.out.print("Enter the power number : ");
	     
		   k = input.nextInt();
		  
		int total = 1 ;    
     for (int i = 1 ; i <= k ; i++) {
    	 total *= n ; 
    	

    	 System.out.print(total);
		   
     }   
	System.out.print("It is the result : " + total);
	} 
}

