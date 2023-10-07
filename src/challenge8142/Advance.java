package challenge8142;

import java.util.InputMismatchException;
import java.util.Scanner;

/** @author Nugraha1313 Oct 6, 2023 4:46:48 PM **/

public class Advance {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputNumber = 0;
		do {
			try {
				System.out.print("input_number = ");
				inputNumber = input.nextInt();
				if(inputNumber < 0) {
					System.out.println("Minimum Number is 0!");
				}
			} catch(InputMismatchException e) {
				System.out.println("Invalid Input!");
//				clean newline in buffer
				input.nextLine();
			}
		} while(inputNumber < 1);
//		close the scanner
		input.close();
		
//		print cube of given number
		for (int i = 1; i <= inputNumber; i++) {
			int cube = (int) Math.pow(i, 3);
			System.out.println("Current Number is : " + i + " and the cube is " + cube);
		}
	}

}