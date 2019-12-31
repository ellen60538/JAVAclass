package tw.org.iii.apps.java;

public class ellen018 {

	public static void main(String[] args) {
		// 變數交換
		int a = 10 , b = 3 ;
		int c = a ;
		a = b ;
		b = c ;
		System.out.printf("a=%d b=%d",a,b);
		System.out.println();
		
		int i = 0 ;
		String[] msg = {"OK","XX"};
		System.out.println(msg[i]);
		i = i ^ 1 ;
		System.out.println(msg[i]);
		i = i ^ 1 ;
		System.out.println(msg[i]);

	}

}
