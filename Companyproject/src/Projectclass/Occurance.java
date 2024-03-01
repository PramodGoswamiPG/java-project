package Projectclass;


import java.util.LinkedHashMap;

public class Occurance {
	
	public static void main(String[] args) {
		LinkedHashMap<Character, Integer> l1=new LinkedHashMap<Character, Integer>();
//		l1.put(1, "hello");
//		l1.put(2, "hii");
//		l1.put(3, "pramod");
//		l1.put(4, "goswami");
//		System.out.println(l1.containsKey(1)); //true
//		System.out.println(l1.containsKey(12));//false
		//containsKey(key)-> return true if that key is present otherwise returns false
		
		String s="hello hi bye welcome";
		for (int i = 0; i <s.length(); i++) {
			if(l1.containsKey(s.charAt(i)))
			{
				l1.put(s.charAt(i),l1.get(s.charAt(i))+1);
			}
			else
			{
				l1.put(s.charAt(i), 1);
			}
			
		}
	for(Character ele : l1.keySet()) {
		System.out.println(ele+"-"+l1.get(ele));
		
	}
	
		
	}
	
	
	}


