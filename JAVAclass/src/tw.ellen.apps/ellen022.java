package tw.ellen.apps;

import tw.org.iii.apps.java.Bike;
import tw.org.iii.apps.tool.Scooter;

public class ellen022 {

	public static void main(String[] args) {
		
		Bike b1 = new Bike() ;
		System.out.println(b1.getColor());
		
		b1.setColor(2) ;
		System.out.println(b1.getColor());
		
		System.out.println("==========================================================");
		
		Scooter s1 = new Scooter() ;
		System.out.println(s1.getColor());
		s1.setColor(2);
		System.out.println(s1.getColor());
	}

}
