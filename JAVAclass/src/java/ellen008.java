package tw.org.iii.apps.java;

public class ellen008 {

	public static void main(String[] args) {
		
		int a = 10 , b = 3 ;
		if (a++ <= 10 && b-- >= 3) {
			System.out.printf("OK: a = %d, b = %d\n", a, b);
		}else {
			System.out.printf("XX: a = %d, b = %d\n", a, b);
		}
		// ------
		int x = 2, y = 3 ;			//單個 &,|,^ 二位元運算
		System.out.println(x & y);	// 10,11 => 10
		System.out.println(x | y);	// 10,11 => 11
		System.out.println(x ^ y);	// 10,11 => 01	(同性相斥異性相吸)
		
	}

}
