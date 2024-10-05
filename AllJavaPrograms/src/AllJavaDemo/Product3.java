package AllJavaDemo;
import java.util.Scanner;

public class Product3 {
	public static void main(String[] args) {
		int id; String title; double price; String description; String category;

        Scanner sc1 = new Scanner(System.in);

       System.out.println(" id: " );
       id = sc1.nextInt();
       System.out.println("id = " + id );
       Scanner sc2 = new Scanner(System.in);
       System.out.println(" title: " );
       title = sc2.nextLine();
       System.out.println( "title : " + title );
       Scanner sc3 = new Scanner(System.in);
       System.out.println(" price: " );
       price = sc3.nextDouble();
       System.out.println( " price = " + price );
       Scanner sc4 = new Scanner(System.in);
       System.out.println(" description: " );
       description = sc4.nextLine();
       System.out.println("description: " + description );
       Scanner sc5 = new Scanner(System.in);
       System.out.println(" category: " );
       category = sc5.nextLine();
       System.out.println( "category: " + category);

		
		
	}
	

}
