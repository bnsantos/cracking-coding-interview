package com.bnsantos.utils;

public class BinaryNode {
	private final String mValue;
	private BinaryNode mLeft;
	private BinaryNode mRight;
	
	public BinaryNode(String value){
		this(value, null, null);
	}
	
	public BinaryNode(String value, BinaryNode left, BinaryNode right){
		mValue = value;
		mLeft = left;
		mRight = right;
	}

	public BinaryNode getLeft() {
		return mLeft;
	}

	public void setLeft(BinaryNode mLeft) {
		this.mLeft = mLeft;
	}

	public BinaryNode getRight() {
		return mRight;
	}

	public void setRight(BinaryNode mRight) {
		this.mRight = mRight;
	}

	public String getValue() {
		return mValue;
	}
	
	
}
