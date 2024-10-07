package AllJavaDemo;
import java.util.Scanner;

public class SumOfOddNumber {
	public static void main(String[] args) {
		
		int i, m,n,sum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		m = input. nextInt();
		System.out.println("Enter End Number : ");
		n = input.nextInt()
;
		for(i = m; i <= n; i++) {
			if(i%2 != 0)
				continue;
			sum = sum+i;
		}
		
		System.out.println("This is the odd number : "+sum);
		
	}

}
