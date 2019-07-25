package Numbers;

import java.util.Scanner;
import java.lang.Math;

public class Pi {
	final static int MIN_NUM = 0;
	final static int MAX_NUM = 9;
	final static double pi = Math.PI;
	
	public static void main(String[] args) {
		int num = inputNumber();
		System.out.print(num + " numbers after the decimal of pi: ");
		System.out.printf("%1." + String.valueOf(num) + "f", pi);
	}
	
	static int inputNumber(){
		int num;
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.println("Enter your number between " + MIN_NUM + " and " + MAX_NUM +" to"
					+ " generate PI to that many decimals: ");
			num = scan.nextInt();
		}while(num < MIN_NUM && num > MAX_NUM);
		System.out.println("You have entered: " + num);
		return num;
	}
}