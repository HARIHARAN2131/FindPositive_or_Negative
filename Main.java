package Program1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number;
		Program1 program1 = new Program1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number ");
		number = scanner.nextInt();
		program1.getResult(number);
		scanner.close();
	}

}
