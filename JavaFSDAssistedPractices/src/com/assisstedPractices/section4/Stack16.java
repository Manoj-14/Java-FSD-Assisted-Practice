package com.assisstedPractices.section4;

public class Stack16 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.pop();
		stack.push(2);
		stack.push(10);
		stack.push(20);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.push(25);
		stack.push(19);
		stack.push(45);
		System.out.println(stack);
		stack.push(45);
		System.out.println(stack);
	}
}

class Stack {
	final int MAX = 5;
	private int[] arr;
	static int top;

	Stack() {
		arr = new int[MAX];
		top = -1;
	}

	public void push(int data) {
		if (top >= MAX - 1)
			System.out.println("Statck Overflow");
		else {
			arr[++top] = data;
			System.out.println(data + " Pushed to stack");
		}
	}

	public void pop() {
		if (top < 0)
			System.out.println("Statck Underflow");
		else {
			int data = arr[top--];
			System.out.println(data + " Poped from stack");
		}
	}
	
	@Override
	public String toString() {
		String res="";
		if(top ==-1) res ="Stack id empty";
		else {
			for(int i=0;i<=top;i++) res+=arr[i]+" " ;
		}
		
		return res;
	}
}