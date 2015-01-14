package com.bnsantos.utils;

public class ListNode {
	private int value;
	private ListNode next;
	
	public ListNode(int value){
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public void setNext(ListNode n){
		this.next = n;
	}

	public ListNode getNext() {
		return next;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof ListNode && ((ListNode)obj).value==this.value;
	}
}
