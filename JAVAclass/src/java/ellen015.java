package tw.org.iii.apps.java;

public class ellen015 {

	public static void main(String[] args) {

			int[] a = new int[7];
			
			for (int i = 0; i < 100; i++) {
				int r = (int) (Math.random() * 9 + 1); // 1 - 9
				a[ (r >= 7) ? r-3 : r ]++ ;
				
			}
			if (a[0] == 0) {
				for(int i = 1; i<=6; i++) {
					System.out.printf("%d點 出現%d次\n", i,a[i]);
				}
			}
		}
}
