package AllJavaDemo;
import java.util.Scanner;

public class InputFromUserArithmatic {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1,num2,result;
		System.out.println("Enter First Number : ");
		num1 = input.nextInt();
		System.out.println("Eneter Second Number : ");
		num2 = input.nextInt();
		
		result = num1 + num2;
		System.out.println("Sum = "+result);
		result =num1 - num2;
		System.out.println("Sub = "+result);
		result =num1 * num2;
		System.out.println("Multiplication = "+result);
		result =num1 / num2;
		System.out.println("Div = "+result);
		result =num1 % num2;
		System.out.println("Remainder = "+result);
		
	}

}
