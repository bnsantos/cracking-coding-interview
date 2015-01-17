package com.bnsantos.chapter4;

import com.bnsantos.utils.BinaryTreeNode;

public class Question7 {
	private static class Result{
		public final BinaryTreeNode node;
		public final boolean isAncestor;
		public Result(BinaryTreeNode node, boolean isAncestor){
			this.node = node;
			this.isAncestor = isAncestor;
		}
	}
	
	private static Result commonAncestorHelper(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q){
		if(root == null){
			return new Result(null, false);
		}
		if(root==p&&root==q){
			return new Result(root, true);
		}
		
		Result rx = commonAncestorHelper(root.getLeft(), p, q);
		if(rx.isAncestor){
			return rx;
		}
		
		Result ry = commonAncestorHelper(root.getRight(), p, q);
		if(ry.isAncestor){
			return ry;
		}
		
		if(rx.node!=null&&ry.node!=null){
			return new Result(root, true);
		}else if(root == p || root == q){
			boolean isAncestor = rx.node != null || ry.node != null ? true : false;
			return new Result(root, isAncestor);
		}
		else{
			return new Result(rx.node!=null?rx.node:ry.node, false);
		}
	}
	
	public static BinaryTreeNode commonAncestor(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q){
		Result r = commonAncestorHelper(root, p, q);
		if(r.isAncestor){
			return r.node;
		}
		return null;
	}
}
