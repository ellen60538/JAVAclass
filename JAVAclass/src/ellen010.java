
public class ellen010 {

	public static void main(String[] args) {
		int month = (int)(Math.random()*12 + 1) ;
		System.out.println(month);
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.printf("%d月有31天",month);
				break ;
			case 2:
				System.out.printf("%d月有28天",month);
				break ;
			case 4: case 6: case 9: case 11:
				System.out.printf("%d月有30天",month);
				break ;
			default :
				System.out.print("錯誤");
				break ;
		}

	}

}
