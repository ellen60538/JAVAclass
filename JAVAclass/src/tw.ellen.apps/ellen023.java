package tw.ellen.apps;

import tw.org.iii.apps.tool.ellen;

public class ellen023 {

	public static void main(String[] args) {
		String s1 = new String() ;
		byte[] b1 = { 97, 98, 99, 100, 101, 102, 103} ;
		String s2 = new String(b1) ;
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = new String(b1,2,4) ;
		System.out.println(s3);
		
		System.out.println("================================");
		
		String a1 = new String(b1) ;
		String a2 = new String(b1) ;
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		// == : 比對是否來自同一記憶體位置
		// String 類別裡的equals 被改寫成比對內容
		
		System.out.println("================================");
		
		ellen e1 = new ellen() ;
		ellen e2 = new ellen() ;
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
		// ellen 類別裡的equals 沒被改寫(且承自父類別Object),所以還是比對記憶體位置
		
		System.out.println("================================");
		
		String a3 = "abcdefg" ;
		String a4 = "abcdefg" ;
		System.out.println(a3 == a4);
		System.out.println(a3.charAt(3));
		System.out.println(a3.substring(2,6));
		System.out.println(a3);
		System.out.println("hamburger".substring(4, 8));

		System.out.println("================================");
		
		String a5 = "ellen" ;
		String a6 = a5 ;
		System.out.println(a5 == a6);
		a5 = "mina" ;
		System.out.println(a5 == a6);
		System.out.println(a5.concat("OOO"));
		System.out.println(a5);
	}

}
