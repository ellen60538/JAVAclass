
public class ellen018 {

	public static void main(String[] args) {
		int a = 10, b = 3 ;
		a = a + b ;
		b = a - b ;
		a = a - b ;
		System.out.printf("a = %d, b = %d\n",a,b);
		
		int i = 0 ;
		String[] msg = {"OK","XX"} ;
		i ^= 1 ;	// 0 or 1 => 1
		System.out.println(msg[i]);
		i ^= 1 ;	// 1 or 1 => 0
		System.out.println(msg[i]);

	}

}
