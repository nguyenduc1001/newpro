package Assign1;

import java.util.Scanner;
import Assign1.CountSqaureAndExponent;

public class Main {

	public static void main(String[] args) {
		System.out.println("-------- This is caculate Square and Cube Exponent of number Program --------");
		System.out.println("Now! Input the number:");
		int number = new Scanner(System.in).nextInt();
		CountSqaureAndExponent c = new CountSqaureAndExponent();
		System.out.println("Square of " + number + " is: " + c.calculateSquare(number));
		System.out.println("Cube Exponent of " + number + " is: " + c.calculatCubeExponent(number));

	}

}
