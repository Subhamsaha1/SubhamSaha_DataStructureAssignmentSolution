package com.gl.gradedProjectQuestion2;

import java.util.*;
public class LinkedListStack {
	private Node headNode; //the first node
	
	private int stackSize;
	
	//nest class to define LinkedList node
	
	private class Node{
		int value;
		Node next;
	}
	
	public LinkedListStack() {
		headNode = null;
		stackSize = 0;
	}
	
	//Add value to the beginning of the list for 
	
	public void push (int value) {
		Node oldHead = headNode;
		
		headNode = new Node();
		headNode.value = value;
		headNode.next = oldHead;
		stackSize++;
	}
	
	public int peek() throws Exception{
		if (headNode == null) throw new EmptyStackException();
		else return headNode.value;
	}
	
	public boolean size() {
		return stackSize == 0;
	}
	
	public static void main(String[] args) {
		
		LinkedListStack mystack = new LinkedListStack(Day1, Day2, Day3);
		Day1 = mystack.push(3);
		Day1 = mystack.push(8);
		Day2 = mystack.push(0);
		Day3 = mystack.push(9);
		System.out.println("Floors at the Day1 is: " + mystack.peek());
		System.out.println("Floors at the Day2 is: " + mystack.peek());
		System.out.println("Floors at the Day3 is: " + mystack.peek());
		System.out.print("The sequential matter in order of size of the floors of stack is: " + mystack.size());
		

	}

}
