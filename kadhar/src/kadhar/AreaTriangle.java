package kadhar;

import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner input=new Scanner(System.in);
          System.out.println("Enter the base: ");
          double base=input.nextDouble();
          System.out.println("Enter the height: ");
          double height=input.nextDouble();
          double triangle=0.5*(base*height);
          System.out.println("Area of Triangle is "+triangle);
          input.close();
          
          
          
	}

}
