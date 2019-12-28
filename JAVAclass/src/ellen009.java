
public class ellen009 {

	public static void main(String[] args) {
		int a = 7 ;
		final int b = 8 ;
		switch (a) {	// byte, short, int, char, String, enum
			case 1:
				System.out.println("A");
				break ;
			case b+2:
				System.out.println("B");
				break ;
			case 127:
				System.out.println("C");
				break ;
			default :
				System.out.println("X");
				break ;
		}

	}

}
