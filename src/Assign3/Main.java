package Assign3;

import java.math.MathContext;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("-------- This is caculate Square and Exponent of number Program --------");
		System.out.println("Now! Input the number");
		double number = new Scanner(System.in).nextDouble();
		System.out.println("Square of " + number + " is: " + Math.pow(number, 2));
		System.out.println("Exponent of " + number + " is: " + Math.pow(number, 3));

	}

}
