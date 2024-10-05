package AllJavaDemo;
import java.util.Scanner;

public class CircleDemo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double radius,area;
		System.out.println("Enetr radius : ");
		radius = input.nextDouble();
		
		area = 3.1416*radius*radius;
		System.out.println("Area of Circle: "+area);
	}

}
