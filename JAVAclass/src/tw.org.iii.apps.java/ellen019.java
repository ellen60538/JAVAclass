package tw.org.iii.apps.java;

public class ellen019 {

	public static void main(String[] args) {
		int i = 0 , sum = 0 ,last = 9487;
		while (i <= last) {
			sum += i++ ;
		}
		System.out.printf("1 + 2 +...+ %d = %d",last,sum);
	}

}
