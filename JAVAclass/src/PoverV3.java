import java.util.Arrays;

public class PoverV3 {

	public static void main(String[] args) {
		int[] poker = new int[52] ;
		for (int i = 0; i < poker.length; i++) poker[i]=i ;
		
		// 洗牌 :
		for (int i = poker.length-1; i > 0; i--) {
			int rand = (int)(Math.random() * (i+1)) ;
			// poker[rand] <=> poker[i]
			int temp = poker[rand] ;
			poker[rand] = poker[i] ;
			poker[i] = temp ;
		}
		for (int v : poker) {
			System.out.println(v);
			// 洗完牌後的樣子
		}
		System.out.println("-------------------------------------");
		
		// 發牌 :
		int[][] players = new int[4][13] ;
		for (int i = 0; i < poker.length; i++) {
			players[i%4][i/4] = poker[i] ;
		}
		
		// 映出花色及點數 :
		char[] suits2 = {'\u2660','\u2665','\u2666','\u2663'} ;
		String[] suits = {"黑桃","紅心","方塊","梅花"} ;
		String[] values = {" A"," 2"," 3"," 4"," 5"," 6"," 7"," 8"," 9","10"," J"," Q"," K",} ;
		for (int[] w : players) {
			//Arrays.sort(w);
			for (int v : w) {
				System.out.print(suits2[v/13] + values[v%13] + "\t");
			}
			System.out.println();
		}
	}

}
