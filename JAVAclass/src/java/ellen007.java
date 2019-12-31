package tw.org.iii.apps.java;

import java.util.Scanner;

public class ellen007 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int year = scanner.nextInt();
		
		// TODO Auto-generated method stub
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("閏年");
				}else {
					System.out.println("不是閏年!");
				}
			}else {
				System.out.println("閏年");
			}
			
		}else {
			System.out.println("不是閏年!");
		}
		
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			//28
		}else {
			//29
		}
		
	}

}
