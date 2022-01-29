package kadhar;

import java.util.Scanner;

public class Basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the i....");
		int i=scan.nextInt();
		System.out.println("Enter the j....");
		int j=scan.nextInt();
		int mul=i*j;
		System.out.println("Multiplication of two number is "+mul);
		scan.close();

	}

}
