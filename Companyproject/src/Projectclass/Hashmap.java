package Projectclass;

import java.util.HashMap;

public class Hashmap {
	
	public static void main(String[] args) {
		HashMap<Character, String> h1=new HashMap<Character, String>();
		h1.put('a', "apple");
		h1.put('d', "dog");
		h1.put('b', "ball");
		h1.put('c', "cat");
	
//		System.out.println(h1);
//		h1.put('a', "aeroplane");
//		System.out.println(h1);
//		System.out.println(h1.keySet());// return set of key
//		System.out.println(h1.values());// return collection of values
		
		for(Character ele:h1.keySet())
		{
			System.out.println(h1.get(ele));
		}
		
		
	}

}
