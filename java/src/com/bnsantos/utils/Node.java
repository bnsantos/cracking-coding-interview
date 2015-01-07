package com.bnsantos.utils;

public class Node {
	private int value;
	private Node next;
	
	public Node(int value){
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public void setNext(Node n){
		this.next = n;
	}

	public Node getNext() {
		return next;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Node && ((Node)obj).value==this.value;
	}
}
