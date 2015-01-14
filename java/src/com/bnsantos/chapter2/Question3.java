package com.bnsantos.chapter2;

import com.bnsantos.utils.ListNode;

public class Question3 {
	public boolean remove(ListNode n){
		if(n.getNext()==null){
			return false;
		}
		ListNode aux = n.getNext();
		n.setValue(aux.getValue());
		n.setNext(aux.getNext());
		return true;
	}
}
