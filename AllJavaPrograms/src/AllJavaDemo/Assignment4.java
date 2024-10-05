package AllJavaDemo;
import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		// create a program to create number of installment per month
				Scanner input = new Scanner(System.in);

				int phonePrice = 1800;
				int numberOfInstallment, installmentPerMonth;
				System.out.print("Enter Number of Installment: ");
				//Number of installment from user
				numberOfInstallment = input.nextInt();
				installmentPerMonth = phonePrice / numberOfInstallment;
				System.out.print("Monthly Installment: " + installmentPerMonth + " euro");
	}

}
