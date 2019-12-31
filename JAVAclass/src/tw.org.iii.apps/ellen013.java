package tw.org.iii.apps.java;

public class ellen013 {
	
	public static void main(String[] args) {
		// Array => Object
		
		int[] a ;
		a = new int[3] ;
		System.out.println(a.length);
		
		int[] b = new int[4] ;
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		int[] c = new int[] {1, 2, 3, 4};
		int[] d = {1, 2, 3, 4} ;		//宣告同時"可以"直接進行給值
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		
		int[] e ;
		e = new int[] {9,8,7,6} ;
		
		int[] f ;
		//f = {9,8,7,6} ;		//不能分開給值
	}
}
