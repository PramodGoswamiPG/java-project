package learninglist;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(36);
		l1.add(28);
		l1.add(11);
		l1.add(33);
		l1.add(77);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		
	}
}
