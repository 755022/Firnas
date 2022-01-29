package kadhar;

import java.util.Scanner;

public class PyramidExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hd=new Scanner(System.in);
		int rows=hd.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		hd.close();

	}

}
