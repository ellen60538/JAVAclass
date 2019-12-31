package tw.ellen.apps;

public class ellen025 {

	public static void main(String[] args) {
		// 正規表示法  regular expression (regex)
		String a = "00" ;
		if (a.matches("^[0-9]{" + a.length() + "}$")) {
			boolean isDup = false ;
			for (int i = 0; i < a.length()-1; i++) {
				char c = a.charAt(i) ;
				if (a.substring(i+1).indexOf(c) >= 0) {
					isDup = true ;
					break ;
				}
			}
			System.out.println( isDup ? "XX" : "OK");
		}
		else
			System.out.println("error");

	}

}
