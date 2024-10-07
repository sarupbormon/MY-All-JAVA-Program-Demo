
package AllJavaDemo;
import java.util.Scanner;

public class FactorialDemo {
	
		
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
		       
	        int i, n, fac=1;
	        
	        System.out.print("Enter a digit = ");
	        n= input.nextInt();
	        
	        for(i=1; i<=n; i++){
	            fac = fac*i;
	        }
	            System.out.println("Factorical of N = "+fac);
	        }
		
	 
}  
	
	
			