package ans9;

import java.util.*;

public class process2 extends Thread{
	
	public static String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven","eight","nine"};
	public String number;
	Scanner sc = new Scanner(System.in);
	
	public void run() {
		
		System.out.println("Enter more than 4 digits number: ");
		number = sc.next();
		
		for(char ch: number.toCharArray()) {
			int i = (int)ch - 48;
			System.out.println(digits[i]+ " ");
		}
	}
}
