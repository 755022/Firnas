package kadhar;

import java.util.Scanner;

public class PrintANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creates a reader instances which takes\
		Scanner reader =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=reader.nextInt();
		System.out.println("Ener the number: ");
		int b=reader.nextInt();
		System.out.println("You entered: "+a);
		System.out.println("You entered: "+b);
		reader.close();

	}

}
