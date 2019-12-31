package tw.ellen.apps;

import tw.org.iii.apps.tool.Student;

public class ellen029 {

	public static void main(String[] args) {
		ellen291 obj1 = new ellen291() ;
		ellen292 obj2 = new ellen292() ;
		Student obj3 = new Student("ellen") ;
		dosomething(obj1) ;
	}
	
	static void dosomething(Javaer javaer) {
		javaer.OCAJP();
	}

}

interface Javaer{
	void OCAJP() ;
	void OCPJP() ;
}

class ellen291 implements Javaer{
	public void OCAJP() {System.out.println("A");} ;
	public void OCPJP() {} ;
}
class ellen292 implements Javaer{
	public void OCAJP() {System.out.println("B");} ;
	public void OCPJP() {} ;
}