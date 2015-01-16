package com.bnsantos.chapter4;

import com.bnsantos.utils.BinaryTreeNode;

public class Question5 {
	public static boolean isBST(BinaryTreeNode root){
		if(root==null){
			return true;
		}
		int value = Integer.parseInt(root.getValue());
		int left = root.getLeft()!=null?Integer.parseInt(root.getLeft().getValue()):Integer.MIN_VALUE;
		int right = root.getRight()!=null?Integer.parseInt(root.getRight().getValue()):Integer.MAX_VALUE;
		if(value>=left&&value<right){
			return isBST(root.getLeft()) && isBST(root.getRight());
		}else{
			return false;
		}
	}

}
