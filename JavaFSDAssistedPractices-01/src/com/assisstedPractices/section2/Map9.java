package com.assisstedPractices.section2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Map9 {

	public static void main(String[] args) {
		hashMap();
		System.out.println();
		hashTable();
		System.out.println();
		treeSet();
	}

	public static void hashMap() {
		Map<String, Integer> hm = new HashMap<>();
		hm.put(null, null);
		hm.put("Torry", 98);
		hm.put("TIm", 89);
		hm.put("Zoya", 11);
		for (String key : hm.keySet())
			System.out.print(key + "->" + hm.get(key) + " | ");
	}
	
	public static void hashTable() {
		Map<Integer, String> ht = new Hashtable<>();
		ht.put(1, "Kiran Praba");
		ht.put(2, "Prabakar");
		ht.put(3, "Divakar");
		for(int i:ht.keySet()) System.out.print(i+"."+ht.get(i)+" | ");
	}
	
	public static void treeSet() {
		SortedMap<String, String> sm = new TreeMap<>();
		sm.put("Manoj", "Lead");
		sm.put("Darshan", "Lead");
		sm.put("Mohan", "Team member");
		sm.put("Bharath", "Team member");
		Iterator<String> iter = sm.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.print(key+"->"+sm.get(key)+" | ");
		}
	}
}
