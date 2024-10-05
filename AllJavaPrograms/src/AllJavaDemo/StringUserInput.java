package AllJavaDemo;
import java.util.Scanner;

public class StringUserInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.print("Enetr your name : ");
		name = input.nextLine();
		System.out.println("Welcome:"+name);
	}

}
