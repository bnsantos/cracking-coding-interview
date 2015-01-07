package com.bnsantos.chapter2;

import com.bnsantos.utils.Node;

public class Question6 {
	public static Node loopBeginning(Node head){
		Node slow = head, fast = head;
		
		while(fast!=null&&fast.getNext()!=null){
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if(slow==fast){
				break;
			}
		}
		
		if(fast==null||fast.getNext()==null){
			return null; //No loop	
		}
		
		slow = head;
		while(slow!=fast){
			slow = slow.getNext();
			fast = fast.getNext();
		}
		return fast;
	}
}
