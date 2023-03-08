package com.assisstedPractices.section4;

import java.util.Queue;
import java.util.LinkedList;

public class Queue18 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(4);
		queue.add(10);
		queue.add(30);
		
		System.out.println("Queue :"+queue);
		System.out.println("Head element of Queue :"+queue.peek());
		queue.remove();
		System.out.println("After removing element of queue :"+queue);
	}
}