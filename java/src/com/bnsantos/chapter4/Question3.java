package com.bnsantos.chapter4;

import com.bnsantos.utils.BinaryTreeNode;

public class Question3 {
	public static BinaryTreeNode minimalBSTTree(int array[]){
		return minialBSTTree(array, 0, array.length-1);
	}
	
	public static BinaryTreeNode minialBSTTree(int array[], int start, int end){
		if(end<start){
			return null;
		}
		int middle = (start+end)/2;
		BinaryTreeNode node = new BinaryTreeNode(Integer.toString(array[middle]));
		node.setLeft(minialBSTTree(array, start, middle-1));
		node.setRight(minialBSTTree(array, middle+1, end));
		return node;
	}
}
