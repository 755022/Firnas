package kadhar;

import java.util.Scanner;

public class Vowel {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner alpha=new Scanner(System.in);
		 char ch=alpha.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println(ch+" is Vowel");
		else
			System.out.println(ch+" is consonant");
		alpha.close();

	}

}
