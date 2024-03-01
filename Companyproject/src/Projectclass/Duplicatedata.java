package Projectclass;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Duplicatedata {
	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> l1=new LinkedHashMap<Integer, Integer>();
		ArrayList<Integer> a1=new ArrayList<Integer>();
		int[] arr= {10,20,20,30,30,45};
		for (int i = 0; i <arr.length; i++) {
			if(l1.containsKey(arr[i]))
			{
				l1.put(arr[i],l1.get(arr[i])+1);
			}
			else
			{
				l1.put(arr[i], 1);
			}
			
		}
		int sum=0;
	for(Integer ele : l1.keySet()) {
		
		if(l1.get(ele)>1)
		{
			sum=sum+ele;
		}
	}
	
		System.out.println(l1);
		System.out.println(sum);
	}
	
	}
	


