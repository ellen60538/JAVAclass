
public class PrimeNumber {

	public static void main(String[] args) {
		int num = 1000;

		for (int i = 2; i <= num; i++) {
			boolean isPrime = true;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false ;
					break ;
				}
			}
			if (!isPrime) 
				System.out.printf("%d\t",i);
			else
				System.out.printf("%d*\t",i);
			
			if (i % 10 == 0)
				System.out.println();
		}
			
		

	}

}
