package com.assisstedPractices.section4;

public class SinglyLinkedList10 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		System.out.print(ll);
		ll.insert(0);
		ll.insert(22);
		System.out.print(ll);
		ll.delete(0);
		System.out.print(ll);
	}
}

class LinkedList {
	Node head = null;

	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insert(int data) {
		Node newNode = new Node(data);

		if (this.head == null) {
			this.head = newNode;
		} else {
			Node cur = this.head;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = newNode;
		}
	}

	public void delete(int data) {
		if (this.head == null) {
			System.out.println("Linked List is empty");
		} else {
			Node cur = this.head, prev = null;
			if (this.head.data == data) {
				head = head.next;
				return;
			}
			while (cur != null && cur.data != data) {
				prev = cur;
				cur = cur.next;
			}
			if (prev == null)
				System.out.println("Data Not found");
			prev.next = cur.next;
		}
	}

	@Override
	public String toString() {
		String res = "";
		Node cur = this.head;
		if (cur == null) {
			res = "Linked List is empty";
		} else {
			while (cur != null) {
				res += cur.data + "->";
				cur = cur.next;
			}
		}
		return res+"\n";
	}
}