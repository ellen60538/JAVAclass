package tw.org.iii.apps.java;

public class ellen014 {

	public static void main(String[] args) {
		int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, a0 = 0;
		for (int i = 0; i < 100; i++) {
			int r = (int) (Math.random() * 6 + 1);

			switch (r) {
			case 1:
				a1++;
				break;
			case 2:
				a2++;
				break;
			case 3:
				a3++;
				break;
			case 4:
				a4++;
				break;
			case 5:
				a5++;
				break;
			case 6:
				a6++;
				break;
			default:
				a0++;
			}
		}
		if (a0 == 0) {
			System.out.printf("點數1出現%d次\n",a1);
			System.out.printf("點數2出現%d次\n",a2);
			System.out.printf("點數3出現%d次\n",a3);
			System.out.printf("點數4出現%d次\n",a4);
			System.out.printf("點數5出現%d次\n",a5);
			System.out.printf("點數6出現%d次\n",a6);
		}

	}
}
