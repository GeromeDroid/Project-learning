package Numbers;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		// use recursion function to get the fibonacci values
		for(int i = 0; i <= num; i++){
			System.out.println(recursion(i));
		}
	}
	
	static int recursion(int i){
		// 0 1 1 2 3 5 8 13
		if(i == 0) return 0;
		if(i <= 2) return 1;
		
		int fibTerm = recursion(i-1) + recursion(i-2);
		return fibTerm;
		
	}

}
