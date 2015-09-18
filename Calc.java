/*
Create an applications which takes three arguments. The first is either a letter (A, S, M, D, or DD). Second and third are operands to either Add, Subtract, Multiply, Divide, or calculate Modulus value. Output an error message if no valid first parameter is supplied. If valid operation, calculate value of operation based on input and output the result to the screen.

javac Operations.java
java Operations A 4 22

Expected output in this case would be:
The sum of 4 + 6 is 26
*/

// 1-st operand: three arguments A, S, M, D, and MM
// 2-nd arg: number
// 3-d arg: number

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		String operation = "Q";
		String a = "A";
		String s = "S";
		String m = "D";
		String mm = "MM";
		int first = 0;
		int second = 0;
		String input = "";

		System.out.println("Enter operation (A, S, M, D or MM): ");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine();

		
		System.out.println("Enter first operand: ");
		first = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Enter second operand: ");
		second = Integer.parseInt(scanner.nextLine());
		
		


		/*
		for (int i = 0; i < args.length ) {
			switch (operation) {
				case "A":
		*/
	}
	
}