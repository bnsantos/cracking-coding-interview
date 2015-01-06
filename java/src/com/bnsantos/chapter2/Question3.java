package com.bnsantos.chapter2;

import com.bnsantos.utils.Node;

public class Question3 {
	public boolean remove(Node n){
		if(n.getNext()==null){
			return false;
		}
		Node aux = n.getNext();
		n.setValue(aux.getValue());
		n.setNext(aux.getNext());
		return true;
	}
}
