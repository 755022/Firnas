package kadhar;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius=scanner.nextDouble();
		double area=Math.PI*(radius*radius);
		System.out.println("Area of circle is: "+area);
		double circle=Math.PI*2*radius;
		System.out.println("The Circumference of the circle is: "+circle);
        scanner.close();
	}

}
