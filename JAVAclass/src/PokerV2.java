
public class PokerV2 {

	public static void main(String[] args) {
		long now = System.currentTimeMillis() ;
		//洗牌
		int[] poker = new int[52] ;
		//for (int i = 0; i < poker.length; i++) poker[i] = i ;
		
		for (int i = 0; i < poker.length; i++) {
			int rand ;
			boolean isRepeat ;
			do {
				rand = (int)(Math.random()*52) ;
				isRepeat = false ;
				// 檢查重複
				for (int j = 0; j < i; j++) {
					if (rand == poker[j]) {
						isRepeat = true ;
						break ;
					}
				}
			}while (isRepeat);

			poker[i] = rand ;
			System.out.println(poker[i]);
			
		}
		System.out.println("-------------------");
		System.out.println(System.currentTimeMillis() - now) ;
	}

}
