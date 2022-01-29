package kadhar;

import java.util.Scanner;

public class FlyodsTrianlge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows,numbers=0,counter,j;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows for floyd triangle");
		rows=input.nextInt();
		System.out.println("Flyods Triangle");
		System.out.println("***********");
		for(counter=1;counter<=rows;counter++)
		{
			for(j=1;j<=counter;j++)
			{
			System.out.print(numbers+" ");
			numbers++;
			}
			System.out.println();
			
		}
		

	}
}


