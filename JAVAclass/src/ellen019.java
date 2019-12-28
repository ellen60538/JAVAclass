
public class ellen019 {

	public static void main(String[] args) {
		int i = 0, sum = 0, last = 1000 ;
		while (i <= last) {
			sum += i++ ;
		}
		System.out.printf("1 + 2 +...+ %d = %d", last, sum);
	}

}
