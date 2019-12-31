package tw.org.iii.apps.java;

public class PokerV1 {

	public static void main(String[] args) {
		long now = System.currentTimeMillis() ;
		// 洗牌
		int[] poker = new int[52]; // 0

		for (int i = 0; i < poker.length; i++) {
			// 檢查機制
			int rand = (int) (Math.random() * 52); // 0-51
			boolean isRepeat = false;
			for (int j = 0; j < i; j++) {
				if (rand == poker[j]) {
					// 重複了
					isRepeat = true;
					break;
				}
			}
			if (!isRepeat) {
				poker[i] = rand;
				System.out.println(poker[i]);
			}else {
				i-- ;
			}
		}
		System.out.println("================");
		System.out.println(System.currentTimeMillis()-now);

	}

}
