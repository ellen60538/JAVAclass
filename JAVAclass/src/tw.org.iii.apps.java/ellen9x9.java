package tw.org.iii.apps.java;

public class ellen9x9 {

	public static void main(String[] args) {
		int row = 3 ;
		int start = 1 ;
		int col = 3 ;
		
		for (int k = 0; k < row; k++) {
			for (int j = 1; j <= 9; j++) {
				for (int i = start; i < start+col; i++) {
					int newi = i + k * col ;
					int r = newi * j ;
	//				System.out.print(i + " x " + j + " = " + r + "\t");
					System.out.printf("%d x %d = %d\t", newi, j, r);
				}
				System.out.println();
			}
			System.out.println("===========================================================");
		}
	}

}
