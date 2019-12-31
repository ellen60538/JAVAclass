package tw.org.iii.apps.java;

import java.util.Scanner;

public class ellen002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte x2 = -128 ;
		short x3 = 128 ;
		byte x4 = (byte)x3 ;
		System.out.println(x4);
		
		byte a = 10, b = 3 ;
		int c = a + b ; // byte, short, int => int
		long d = 12 ;
		long e = c + d ;
	}

}
