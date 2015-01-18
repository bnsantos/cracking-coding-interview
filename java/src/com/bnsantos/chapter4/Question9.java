package com.bnsantos.chapter4;

import com.bnsantos.utils.BinaryTreeNode;

public class Question9 {
	public static void findSum(BinaryTreeNode root, int sum){
		int depth = depth(root);
		String[] path = new String[depth];
		findSum(root, path, sum, 0);
	}
	
	private static void findSum(BinaryTreeNode root, String[] path, int sum, int level){
		if(root==null){
			return;
		}
		
		path[level] = root.getValue();
		int t=0;
		for(int i=level;i>=0;i--){
			t+=Integer.parseInt(path[i]);
			if(t==sum){
				print(path, i, level);
			}
		}
		findSum(root.getLeft(), path, sum, level+1);
		findSum(root.getRight(), path, sum, level+1);
		
		path[level] = Integer.toString(Integer.MIN_VALUE);
	}
	
	private static void print(String[] path, int start, int end){
		for(int i=start;i<=end;i++){
			System.out.print(path[i]+" ");
		}
		System.out.println();
	}
	
	private static int depth(BinaryTreeNode root){
		if(root==null)
			return 0;
		else 
			return 1 + Math.max(depth(root.getLeft()), depth(root.getRight()));
	}
}
