package com.bnsantos.chapter4;

import com.bnsantos.utils.BinaryNode;

public class Question1 {
	public static boolean isBalanced(BinaryNode root){
		return maxHeight(root)!=-1;
	}
	
	private static int maxHeight(BinaryNode root){
		if(root==null){
			return 0;
		}
		
		int leftH = maxHeight(root.getLeft());
		if(leftH==-1){
			return leftH;
		}
		
		int rightH = maxHeight(root.getRight());
		if(rightH==-1){
			return rightH;
		}
		
		if(Math.abs(leftH-rightH)>1){
			return -1;
		}else{
			return Math.max(leftH, rightH)+1;
		}
	}
}
