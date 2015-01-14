package com.bnsantos.chapter2;

import com.bnsantos.utils.ListNode;

public class Question7 {
	public static boolean palindrome(ListNode head){
		ListNode reverted = revert(head);
		ListNode pNormal=head,pReverted=reverted;
		while(pNormal!=null&&pReverted!=null){
			if(pNormal.getValue()!=pReverted.getValue()){
				return false;
			}
			pNormal = pNormal.getNext();
			pReverted = pReverted.getNext();
		}
		return true;
	}
	
	
	private static ListNode revert(ListNode head){
		ListNode reverted = new ListNode(head.getValue());
		ListNode current = head.getNext();
		while(current!=null){
			ListNode n = new ListNode(current.getValue());
			n.setNext(reverted);
			reverted = n;
			current = current.getNext();
		}
		return reverted;
	}

}
