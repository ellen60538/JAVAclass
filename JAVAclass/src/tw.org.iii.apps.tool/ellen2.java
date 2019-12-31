package tw.org.iii.apps.tool;

public class ellen2 {

	public static void main(String[] args) {

		ellen22  obj1 = new ellen22() ;
//		System.out.println(obj1.a);
	}

}

class ellen21 {
	int a = 12 ;
	public ellen21() {
		System.out.println("ellen21()");
	}
	{
		System.out.println("{} a = " + a);
	}
	static {
		System.out.println("static ellen21{}");
	}
	static void m1(){
		System.out.println("static ellen21 m1()");
	}
}

class ellen22 extends ellen21 {
	ellen22(){
		System.out.println("ellen22()");
	}
	{
		System.out.println("ellen22.{}");
	}
	static {
		System.out.println("static ellen22{}");
	}
	static void m1(){
		System.out.println("static ellen22 m1()");
	}
}




