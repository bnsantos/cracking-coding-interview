package com.bnsantos.chapter4;

import com.bnsantos.utils.BinaryTreeNode;

public class Question8 {

	public static boolean containTree(BinaryTreeNode t1, BinaryTreeNode t2){
		if(t2==null){
			return true;
		}
		return subTree(t1, t2);
	}
	
	public static boolean subTree(BinaryTreeNode t1, BinaryTreeNode t2){
		if(t1==null){
			return false;
		}
		if(t1.getValue().equals(t2.getValue())){
			if(matchTree(t1, t2)) return true;
		}
		
		return (subTree(t1.getLeft(), t2) || subTree(t1.getRight(), t2));
	}
	
	public static boolean matchTree(BinaryTreeNode t1, BinaryTreeNode t2){
		if(t2==null&&t1==null){
			return true;
		}
		if(t1==null||t2==null){
			return false;
		}
		
		if(!t1.getValue().equals(t2.getValue())){
			return false;
		}
		return (matchTree(t1.getLeft(), t2.getLeft()))&&matchTree(t1.getRight(), t2.getRight());
	}
}
