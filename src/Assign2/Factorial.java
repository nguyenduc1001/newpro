package Assign2;

import java.util.Scanner;

public class Factorial {

	public static long tinhGiaithua(int n) {
		long giai_thua = 1;
		if (n == 0 || n == 1) {
			return giai_thua;
		} else {
			for (int i = 2; i <= n; i++) {
				giai_thua *= i;
			}
			return giai_thua;
		}
	}

	public static void main(String[] args) {
		System.out.println("-------- This is caculate Factorial of number Program --------");
		System.out.println("Now! Input the number");
		@SuppressWarnings("resource")
		int number = new Scanner(System.in).nextInt();

		System.out.println("Factorial of " + number + " is: " + Factorial.tinhGiaithua(number));

	}
}
