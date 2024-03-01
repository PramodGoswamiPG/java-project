package learningmap;

import java.util.Hashtable;

public class Mainclasshashtable {
	
	public static void main(String[] args) {
		Hashtable<Integer,String> m1=new Hashtable<Integer,String>();
		m1.put(123, "test");
		m1.put(5, "pramod");
		m1.put(12, "goswami");
		
		int n=m1.size();
		System.out.println("total elements "+n);
		System.out.println(m1);
		Object e1=m1.get(5.6);
		System.out.println("value associted to '5.6' is "+e1);
		System.out.println("adding duplicate");
		
//		kk
		System.out.println(m1);
	}

}
