package javapackage;

import java.util.HashMap;

public class Hashmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm=new HashMap<>();
		hm.put(1, 1);
		hm.put(2, 4);
		hm.put(3, 9);
		hm.put(4, 16);
		hm.put(5, 25);
		hm.put(6, 36);
		hm.put(7, 49);
		hm.put(8, 64);
		hm.put(9, 81);
		hm.put(10, 100);
		hm.put(11, 121);
		hm.put(12, 144);
		hm.put(13, 169);
		hm.put(14, 196);
		hm.put(15, 225);
		for(Integer key:hm.keySet())
		{
			System.out.println("Key:"+key+"values:"+hm.get(key));
		}
		

	}

}
