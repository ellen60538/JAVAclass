package tw.org.iii.apps.java;

import java.util.Arrays;

public class PokerV3 {

	public static void main(String[] args) {
		int num = 52 ;
		int[] poker = new int[num] ;
		for (int i = 0; i < poker.length; i++) poker[i] = i ;
		
		for (int i = poker.length-1; i > 0; i--) {
			int rand = (int)( Math.random()*(i+1) ) ; //rand => index
			// poker[rand] <=> poker[i]
			int temp = poker[rand] ;
			poker[rand] = poker[i] ;
			poker[i] = temp ;
		}
		for (int v : poker) {
			System.out.println(v) ;
		}
		System.out.println("=================");
		
		int[][] players = new int[4][13] ;
		
		for (int i= 0; i < poker.length; i++) {
			players[i%4][i/4] = poker[i] ;
		}
		
		char[] suits2 = {'\u2660','\u2665','\u2666','\u2663'} ;
		String[] suits = {"黑桃","紅心","方塊","梅花"} ;
		String[] values = {"A ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10","J ","Q ","K "} ;
		for (int[] w : players) {
			Arrays.sort(w);
			for (int v : w) {
				System.out.print(suits2[v/13] + values[v%13] + " ");
			}
			System.out.println();
		}
		
		
	}

}
