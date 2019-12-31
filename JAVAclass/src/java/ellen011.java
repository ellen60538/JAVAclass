package tw.org.iii.apps.java;

public class ellen011 {

	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
		int i = 0;
		for (printStart(); i<10; printLine()) {
			System.out.println(i++);
		}
	}
	
	static void printStart() {
		System.out.println("START!!");
	}
	static void printLine() {
		System.out.println("================");
	}
}
