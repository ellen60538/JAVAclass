package tw.org.iii.apps.java;

public class ellen009 {

	public static void main(String[] args) {
		int a = 10 ;	//byte, short, int, char, string, enum
		final int b = 10 ;
		switch (a) {
			case 1:
				System.out.println("A");
				break ;
			case b:
				System.out.println("B");
				break ;
			case 100:
				System.out.println("C");
				break ;
			default:
				System.out.println("X");
				break ;
		}

	}

}
