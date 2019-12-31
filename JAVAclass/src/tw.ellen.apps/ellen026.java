package tw.ellen.apps;

import tw.org.iii.apps.tool.TWId;

public class ellen026 {

	public static void main(String[] args) {
		TWId id1 = new TWId();
		TWId id2 = new TWId(false);
		TWId id3 = new TWId(4);
		TWId id4 = new TWId(7,true);
		System.out.println(id1.getId() + ":" + (TWId.checkId(id1.getId()) ? "OK":"XX") );
		System.out.println(id2.getId() + ":" + (TWId.checkId(id2.getId()) ? "OK":"XX") );
		System.out.println(id3.getId() + ":" + (TWId.checkId(id3.getId()) ? "OK":"XX") );
		System.out.println(id4.getId() + ":" + (TWId.checkId(id4.getId()) ? "OK":"XX") );

		TWId id5 = TWId.createTWId("P223234983");
		if (id5 != null)
			System.out.println(id5.getId());
		else
			System.out.println("null");
	}

}
