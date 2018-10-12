package Assign5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PhantichSoDienthoai {

	public static void main(String[] args) {
		/*
		 * System.out.println("--------Program --------");
		 * System.out.println("Now! Input String:"); 
		 * String s = new Scanner(System.in).nextLine();
		 * 
		 * StringTokenizer st = new StringTokenizer(s, " - ",false); 
		 * while (st.hasMoreTokens()) {
		 * 
		 * System.out.println("MA QUOC GIA LA: " + st.nextToken());
		 * System.out.println("MA VUNG LA: " + st.nextToken());
		 * System.out.println("SDT: " + st.nextToken()); }
		 */
		String s = "(091) 022-6758080";
		String temp1[] = s.split(" ");
		String temp2[] = temp1[1].split("-");
		System.out.println("MA QUOC GIA LA: " + temp1[0]);
		System.out.println("MA VUNG LA: " + "(" + temp2[0] + ")");
		System.out.println("SDT: " + "(" + temp2[1] + ")");
	}

}