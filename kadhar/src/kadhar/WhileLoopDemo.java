package kadhar;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the any integer value below 10");
		number=sc.nextInt();
		while(number<=10)
		{
			sum=sum+number;
			number++;
		}
        System.out.format(" Sum of the Numbers From the While Loop is: %d",sum);
        sc.close();
	}

}
