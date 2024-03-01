package learningiterator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Mainclass2 {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(101, "java");
		map1.put(102, "java scritp");
		map1.put(103, "sql");
		map1.put(104, "web");
		map1.put(105, "spring");
		
		Set<Integer> set1=map1.keySet();
		// takes all the key's from map and convert into set type
		// returns it
		System.out.println(set1);
		
		Iterator<Integer> keyitr=set1.iterator();
		while(keyitr.hasNext())
		{
			Integer keyelement=keyitr.next();
			String value =map1.get(keyelement);
			System.out.println(keyelement +"->"+value);
		}
		
		System.out.println("getting only values from map");
		Collection<String> valcoll=map1.values();
		//taking all the values of the map and covert into collection and return it
		Iterator<String> valitr=valcoll.iterator();
		while(valitr.hasNext())
		{
			String value=valitr.next();
		
		}
	}

}
