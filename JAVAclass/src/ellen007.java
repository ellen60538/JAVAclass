import java.util.Scanner;

public class ellen007 {

	public static void main(String[] args) {
		// 四年一閏,百年不閏,四百又閏
		System.out.print("Input year : ") ;
		Scanner scanner = new Scanner(System.in) ;
		int year = scanner.nextInt() ;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					//29
					System.out.print(year + "年是閏年");
				}else {
					//28
					System.out.print(year + "年不是閏年");
				}
			}else {
				//29
				System.out.print(year + "年是閏年");
			}
		}else {
			//28
			System.out.print(year + "年不是閏年");
		}

	}

}
