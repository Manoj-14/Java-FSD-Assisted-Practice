package com.assisstedPractices.section4;

public class DoublyLinkedLIst14 {
	public static void main(String[] args) {
		DublyLinkedList ll = new DublyLinkedList();
		ll.printll();
		ll.insertFirst(0);
		ll.insertEnd(22);
		ll.insertFirst(1);
		ll.insertEnd(50);
		ll.insertMid(50,80);
		ll.printll();
	}
}

class DublyLinkedList {
	Node head = null;

	private class Node {
		int data;
		Node next, prev;

		Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public void insertEnd(int data) {
		Node newNode = new Node(data);

		if (this.head == null) {
			this.head = newNode;
		} else {
			Node cur = this.head;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = newNode;
			newNode.prev = cur;
		}
	}

	public void insertFirst(int data) {
		Node newNode = new Node(data);

		if (this.head == null) {
			this.head = newNode;
		} else {
			newNode.next = this.head;
			this.head.prev = newNode;
			this.head = newNode;
		}
	}

	public void insertMid(int key, int data) {
		Node newNode = new Node(data);
		if (this.head == null) {
			System.out.println("Data Not found");
			return;
		} else {
			Node cur = this.head;
			if (cur.next != null && cur.data == key) {
				newNode.next = cur.next;
				cur.next.prev = newNode;
				newNode.prev = cur;
				cur.next = newNode;
				return;
			}
			else {
				cur = cur.next;
				while (cur.next!= null) {
					if (cur.data == key) {
						newNode.next = cur.next;
						newNode.prev = cur;
						cur.next.prev = newNode;
						cur.next = newNode;
						return;
					}
					cur = cur.next;
				}
				if(cur.data == key) {
					this.insertEnd(data);
				}
			}
		}
		System.out.println("Key Not found");
	}

	public void printll() {
		String res = "";
		Node cur = this.head;
		if (cur == null) {
			System.out.println("Linked List is empty");
		} else {
			Node last = null;
			while (cur != null) {
				res += cur.data + "->";
				last = cur;
				cur = cur.next;
			}
			System.out.println("Forward Direction:");
			System.out.println(res);
			res = "";
			while (last != null) {
				res += last.data + "->";
				last = last.prev;
			}
			System.out.println("backward Direction:");
			System.out.println(res);
		}
	}
}