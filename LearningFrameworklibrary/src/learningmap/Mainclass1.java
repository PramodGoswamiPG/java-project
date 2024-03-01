package learningmap;

import java.util.HashMap;

public class Mainclass1 {
	public static void main(String[] args) {
		HashMap m1=new HashMap();
		m1.put(123, "test");
		m1.put(5.6, true);
		m1.put(false, null);
		
		int n=m1.size();
		System.out.println("total elements "+n);
		System.out.println(m1);
		Object e1=m1.get(5.6);
		System.out.println("value associted to '5.6' is "+e1);
		System.out.println("adding duplicate");
		
		m1.put(5.6, "pramod");
		System.out.println(m1);
	}

}
