package kadhar;

import java.util.Scanner;

public class AreaRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length of a Rectangle: ");
		double length=scanner.nextDouble();
		System.out.println("Enter the width of a  Rectangle: ");
		double width=scanner.nextDouble();
		double area=length*width;
		System.out.println("Area of Rectangle: "+area);
        scanner.close();
	}

}
