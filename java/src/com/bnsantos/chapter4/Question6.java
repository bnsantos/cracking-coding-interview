package com.bnsantos.chapter4;

import com.bnsantos.utils.TreeNodeParent;

public class Question6 {
	public static TreeNodeParent inOrderNext(TreeNodeParent current){
		if(current == null){
			return null;
		}
		
		if(current.getRight()!=null){
			return leftMostChild(current.getRight());
		}else{
			TreeNodeParent q = current;
			TreeNodeParent x = q.getParent();
			while(x!=null&&x.getLeft()!=q){
				q = x;
				x = x.getParent();
			}
			return x;
		}
	}
	
	public static TreeNodeParent leftMostChild(TreeNodeParent current){
		if(current==null){
			return null;
		}
		while(current.getLeft()!=null){
			current = current.getLeft();
		}
		return current;
	}

}
