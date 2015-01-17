package com.bnsantos.utils;

public class TreeNodeParent {
	private final String mValue;
	private TreeNodeParent mLeft;
	private TreeNodeParent mRight;
	private TreeNodeParent mParent;
	
	public TreeNodeParent(String value){
		mValue = value;
	}

	public TreeNodeParent getLeft() {
		return mLeft;
	}

	public void setLeft(TreeNodeParent mLeft) {
		this.mLeft = mLeft;
	}

	public TreeNodeParent getRight() {
		return mRight;
	}

	public void setRight(TreeNodeParent mRight) {
		this.mRight = mRight;
	}

	public TreeNodeParent getParent() {
		return mParent;
	}

	public void setParent(TreeNodeParent mParent) {
		this.mParent = mParent;
	}

	public String getValue() {
		return mValue;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof TreeNodeParent && mValue == ((TreeNodeParent)obj).mValue;
	}
}
