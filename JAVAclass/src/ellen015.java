
public class ellen015 {

	public static void main(String[] args) {
		int[] p = new int[7] ;

		for (int i = 0; i < 100000; i++) {
			// 灌鉛的骰子 嘿嘿嘿...
			int rand = (int)(Math.random()*9 + 1) ;	// 1-9
			p[rand>=7 ? rand-3 : rand]++ ; 
		}
		
		if (p[0] == 0) {
			for (int i = 0; i <= 6; i++) {
				System.out.printf("%d點出現%d次\n", i, p[i]);
			}
		}
	}

}
