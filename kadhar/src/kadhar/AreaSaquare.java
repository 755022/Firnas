package kadhar;

import java.util.Scanner;

public class AreaSaquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Enter the side of square: ");
         Scanner scanner=new Scanner(System.in);
         double side=scanner.nextDouble();
         double square=side*side;
         System.out.println("Area of Square is "+square);
         scanner.close();	
	}

}
