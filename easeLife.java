package <your.package.name>;

import java.util.InputMismatchException;
import java.util.Scanner;


public class <yourClassName> {
	static Scanner sc = new Scanner(System.in);

	public static int intIn(String print) throws 
InputMismatchException {
		System.out.print(print + ": ");
		int input = 0;
		try { input = sc.nextInt(); }
		catch(InputMismatchException e) {
			throw new InputMismatchException("------ Type 
mismatch: Integer Expected -----\n");
		}
		return input;
	}
	public static void print(String print, boolean usePrintLn) {
		if(!usePrintLn){
			System.out.print(print);
		}
		else { System.out.println(print); }
	}
	public static String strIn(String userInput) {
		System.out.print(userInput+": ");
		Scanner sc = new Scanner(System.in);
		String out = sc.nextLine();
		return out;
	}
