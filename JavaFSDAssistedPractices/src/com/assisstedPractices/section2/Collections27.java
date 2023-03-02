package com.assisstedPractices.section2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;
import java.util.Vector;


public class Collections27 {
	public static void main(String[] args) {
		System.out.println("Array List");
		arrayList();
		System.out.println("------------------");
		System.out.println("Vector");
		vector();
		System.out.println("------------------");
		System.out.println("Linked List");
		linkedList();
		System.out.println("------------------");
		System.out.println("Priority queue");
		priorityQueue();
		System.out.println("------------------");
		System.out.println("Hash Set");
		hashSet();		
		System.out.println("------------------");
		System.out.println("Linked hash set");
		linkedHashSet();
		System.out.println("------------------");
		System.out.println("Tree set");
		treeSet();
	}
	
	public static void arrayList() {
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(2);
		arrList.add(4);
		arrList.add(6);
		arrList.add(49);
		System.out.println(arrList);
	}
	
	public static void vector() {
		Vector<Integer> vecInteger = new Vector<>();
		vecInteger.add(4);
		vecInteger.add(3);
		vecInteger.add(87);
		vecInteger.add(77);
		System.out.println(vecInteger);		
	}
	
	public static void linkedList() {
		List<String> ll = new LinkedList<>();
		ll.add("Max");
		ll.add("Tex");
		ll.add("Abhi");
		ll.add("Zoya");
		System.out.println(ll);
		
//		Iterator<String> iter = ll.iterator();
//		while(iter.hasNext()) System.out.println(iter.next());
	}
	
	public static void priorityQueue() {
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(6);
		queue.add(67);
		queue.add(23);
		queue.add(88);
		queue.add(89);
		System.out.println(queue);
	}
	
	public static void hashSet() {
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(66);
		hashSet.add(1);
		hashSet.add(56);
		hashSet.add(99);
		System.out.println(hashSet);
	}
	
	public static void linkedHashSet() {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Mani");
		lhs.add("Manoj");
		lhs.add("Deepthi");
		lhs.add("Abhi");
		System.out.println(lhs);
	}
	
	public static void treeSet() {
		TreeSet<Double> ts = new TreeSet<>();
		ts.add(3.44);
		ts.add(31.54);
		ts.add(99.0);
		System.out.println(ts);
	}
}
