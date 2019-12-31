package tw.org.iii.apps.java;

public class ellen006 {

	public static void main(String[] args) {
		double rand = Math.random() ;
		int score = (int)(rand*101) ;
		System.out.println(score);
//		if (score >= 60) {
//			System.out.println("Pass!");
//		}else {
//			System.out.println("Down!");
//		}
		
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else {
			System.out.println("E");	
		}
		
//		int num = (int)(Math.random()*49 + 1) ;
//		System.out.println(num);

	}

}
