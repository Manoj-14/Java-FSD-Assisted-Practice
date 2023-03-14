package com.assisstedPractices.section4;

public class CircularLinkedList12 {
	public static void main(String[] args) {
		CirLinkedList ll = new CirLinkedList();
		System.out.print(ll);
		ll.sortedInsert(0);
		ll.sortedInsert(22);
		ll.sortedInsert(23);
		ll.sortedInsert(1);
		System.out.print(ll);
	}
}

class CirLinkedList {
	Node head = null;

	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void sortedInsert(int data) {
		Node new_node = new Node(data);
		Node current = this.head;
		if (current == null) {
			new_node.next = new_node;
			head = new_node;
		} else if (current.data >= new_node.data) {
			while (current.next != head)
				current = current.next;
			current.next = new_node;
			new_node.next = head;
			head = new_node;
		} else {
			while (current.next != head && current.next.data < new_node.data)
				current = current.next;
			new_node.next = current.next;
			current.next = new_node;
		}

	}

	@Override
	public String toString() {
		String res = "";
		Node cur = this.head;
		if (cur == null) {
			res = "Linked List is empty";
		} else {
			do {
				res += cur.data + "->";
				cur = cur.next;
			} while (cur != this.head);
		}
		return res + "\n";
	}
}