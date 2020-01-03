package tw.ellen.apps;

import java.util.Arrays;

public class Mahjong {

	public static void main(String[] args) {
		int num = 144;
		int[] mahjong = new int[num];
		for (int i = 0; i < mahjong.length; i++)
			mahjong[i] = i;

		// 洗牌
		for (int i = mahjong.length - 1; i > 0; i--) {
			int rand = (int) (Math.random() * (i + 1));
			int temp = mahjong[rand];
			mahjong[rand] = mahjong[i];
			mahjong[i] = temp;
		}
		for (int v : mahjong)
			System.out.println(v);

		// 發牌
		int[][] players = new int[4][16];
		for (int i = 0; i < 64; i++) {
			int newi = i % 16;
			players[newi / 4][i % 4 + i / 16 * 4] = mahjong[i];
		}

		// 花色
		String[] value = { "一", "二", "三", "四", "五", "六", "七", "八", "九" };
		String[] unit = { "萬", "條", "筒" };
		String[] flower = {"春","夏","秋","冬","梅","蘭","竹","菊"} ;
		String[] words = {"東","南","西","北","中","發","白"} ;

		for (int[] v : players) {
			Arrays.sort(v);
			for (int w : v) {
				System.out.print((w < 36 ? (w < 8 ? flower[w] : words[w/4 - 2]) : (value[w % 36 / 4] + unit[w / 36 - 1])) + "\t");
			}
			System.out.println();
		}
	}

}
