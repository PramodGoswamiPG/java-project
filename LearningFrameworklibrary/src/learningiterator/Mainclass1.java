package learningiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Mainclass1 {
	public static void main(String[] args) {
		ArrayList<String> l1 =new ArrayList<String>();
		l1.add("sql");
		l1.add("spring");
		l1.add("java");
		l1.add("web");
		l1.add("logical programimg");
		
		System.out.println("list elements: using normal for loop");
		for (int i = 0; i <l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("============================");
		System.out.println("list elements: using normal for each loop");
		for (String element : l1) {
			System.out.println(element);
		}
		System.out.println("============================");
		System.out.println("list elements: using iterator");
		
		Iterator<String> itr=l1.iterator();
		while(itr.hasNext())
		{
			String element=itr.next();
			System.out.println(element);
		}
		System.out.println("============================");
		System.out.println("list elements: using listiterator");
		ListIterator<String> listitr=l1.listIterator();
		while(listitr.hasNext())
		{
			String element=listitr.next();
			System.out.println(element);
		}
		System.out.println("============================");
		
		System.out.println("list elements in reverse direction: using listiterator");
		
		while(listitr.hasPrevious())
		{
			String element=listitr.previous();
			System.out.println(element);
		}
		
	}

}
