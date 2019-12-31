package tw.org.iii.apps.tool;

import tw.org.iii.apps.java.*; // *代表類別(class)
//	import tw.org.iii.apps.java.Bike ;
//	public class Scooter extends tw.org.iii.apps.java.Bike
/*	import a.b.* ==>a.b.brad
 	import c.d.* ==>c.d.brad	*/

public class Scooter extends Bike{
	private int gear;
	
	public Scooter() {
		super(4);
		System.out.println("Scooter()");
	}

	public void upSpeed() {
		super.upSpeed();	// 呼叫父類別的物件實體 => Super
		speed *= 1.2 ;
	}
	
	public void upSpeed(int gear) {
		setGear(gear) ;
		speed = speed < 1 ? 1 : speed * 1.2 * gear;
	}

	private void setGear(int gear) {
		this.gear = gear;
	}
}
