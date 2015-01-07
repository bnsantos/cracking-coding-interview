package com.bnsantos.chapter2;

import com.bnsantos.utils.Node;

public class Question7 {
	public static boolean palindrome(Node head){
		Node reverted = revert(head);
		Node pNormal=head,pReverted=reverted;
		while(pNormal!=null&&pReverted!=null){
			if(pNormal.getValue()!=pReverted.getValue()){
				return false;
			}
			pNormal = pNormal.getNext();
			pReverted = pReverted.getNext();
		}
		return true;
	}
	
	
	private static Node revert(Node head){
		Node reverted = new Node(head.getValue());
		Node current = head.getNext();
		while(current!=null){
			Node n = new Node(current.getValue());
			n.setNext(reverted);
			reverted = n;
			current = current.getNext();
		}
		return reverted;
	}

}
