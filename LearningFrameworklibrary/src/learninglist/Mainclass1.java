package learninglist;

import java.util.ArrayList;

public class Mainclass1 {
	public static void main(String[] args) {
		
		ArrayList l1=new ArrayList();
		
		l1.add(100);//autoboxing and upcasting
		l1.add(45.67);//autoboxing and upcasting
		l1.add("pramod");//string typecasted to object class
		l1.add(null);//null type casted to object class
		l1.add(100);
		
		int n=l1.size();
		
		
		System.out.println("total elements: "+n);
//		l1.clear();
		System.out.println(l1);
		boolean res=l1.isEmpty();
		
		
		System.out.println("is arraylist empty: "+res);
	}

}
