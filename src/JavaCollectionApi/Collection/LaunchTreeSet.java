package JavaCollectionApi.Collection;

import java.util.TreeSet;

public class LaunchTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet ts=new TreeSet();
		
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		//ts.add(null); // NullPointerException
		System.out.println(ts);
		ts.add(125);

		System.out.println(ts);
	}

}
