package tw.org.iii.apps.java;

public class Bike {
	protected double speed ;
	protected int color ;	//0: no color
	
	public Bike() {
		System.out.println("Bike()");
		color = 1 ;
	}
	public Bike(int color) {			//建構式沒有傳回其型別,且名稱要與類別一致
		System.out.println("Bike(int)");
		if (color > 0)
			this.color = color ;
		else
			this.color = 1 ;
	}
	public void setColor(int color) {
		if (color > 0)
			this.color = color ;
		else
			this.color = 1 ;
	}
	public int getColor(){
		return color ;
	}
	
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.2 ;
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.7 ;
	}
	
	public double getSpeed() {
		return speed ;
	}
}
