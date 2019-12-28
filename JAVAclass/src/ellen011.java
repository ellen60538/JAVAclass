
public class ellen011 {

	public static void main(String[] args) {
		int i = 0 ;
		for (printName(); i < 10; printLine()) {
			System.out.println(i++);
		}

	}
	
	static void printName() {
		System.out.println("Name");
	}
	static void printLine() {
		System.out.println("============");
	}

}
