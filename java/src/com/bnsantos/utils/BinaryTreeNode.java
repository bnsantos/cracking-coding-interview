package com.bnsantos.utils;

public class BinaryTreeNode {
	private final String mValue;
	private BinaryTreeNode mLeft;
	private BinaryTreeNode mRight;
	
	public BinaryTreeNode(String value){
		this(value, null, null);
	}
	
	public BinaryTreeNode(String value, BinaryTreeNode left, BinaryTreeNode right){
		mValue = value;
		mLeft = left;
		mRight = right;
	}

	public BinaryTreeNode getLeft() {
		return mLeft;
	}

	public void setLeft(BinaryTreeNode mLeft) {
		this.mLeft = mLeft;
	}

	public BinaryTreeNode getRight() {
		return mRight;
	}

	public void setRight(BinaryTreeNode mRight) {
		this.mRight = mRight;
	}

	public String getValue() {
		return mValue;
	}
	
	public static String inOrderTraversal(BinaryTreeNode root){
		if(root==null){
			return "";
		}
		return inOrderTraversal(root.getLeft()) + " " + root.mValue + " " + inOrderTraversal(root.mRight);
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof BinaryTreeNode && mValue == ((BinaryTreeNode)obj).mValue;
	}
}
