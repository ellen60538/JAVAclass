
public class ellen9X9 {

	public static void main(String[] args) {
		int start = 2, col = 4, row = 2 ;
		for (int k = 0; k < row; k++) {
			for (int j = 1; j < 10; j++) {
				for (int i = start; i < start + col; i++) {
					int newi = i + k * col ;
					int ans = newi * j ;
					System.out.printf("%d X %d = %d\t", newi, j, ans);
				}
				System.out.println();
			}
			System.out.println("----------------");
		}
	}

}
