package com.bnsantos.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bnsantos.chapter4.Question4;
import com.bnsantos.utils.BinaryTreeNode;

public class Question4_4 {
	private BinaryTreeNode mRoot;
	private List<List<BinaryTreeNode>> mResult;
	
	@Before
	public void init(){
		mRoot = new BinaryTreeNode("0");
		BinaryTreeNode n1 = new BinaryTreeNode("1");
		BinaryTreeNode n2 = new BinaryTreeNode("2");
		BinaryTreeNode n3 = new BinaryTreeNode("3");
		BinaryTreeNode n4 = new BinaryTreeNode("4");
		BinaryTreeNode n5 = new BinaryTreeNode("5");
		BinaryTreeNode n6 = new BinaryTreeNode("6");
		BinaryTreeNode n7 = new BinaryTreeNode("7");
		BinaryTreeNode n8 = new BinaryTreeNode("8");
		BinaryTreeNode n9 = new BinaryTreeNode("9");
		BinaryTreeNode n10 = new BinaryTreeNode("10");
		BinaryTreeNode n11 = new BinaryTreeNode("11");
		BinaryTreeNode n12 = new BinaryTreeNode("12");
		BinaryTreeNode n13 = new BinaryTreeNode("13");
		BinaryTreeNode n14 = new BinaryTreeNode("14");
		
		mRoot.setLeft(n1);
		mRoot.setRight(n8);
		
		n1.setLeft(n2);
		n1.setRight(n5);
		
		n2.setLeft(n3);
		n2.setRight(n4);
		
		n5.setLeft(n6);
		n5.setRight(n7);
		
		n8.setLeft(n9);
		n8.setRight(n12);
		
		n9.setLeft(n10);
		n9.setRight(n11);
		
		n12.setLeft(n13);
		n12.setRight(n14);
		
		mResult = new ArrayList<List<BinaryTreeNode>>();
		List<BinaryTreeNode> current = new ArrayList<BinaryTreeNode>();
		current.add(mRoot);
		mResult.add(current);
		
		current = new ArrayList<BinaryTreeNode>();
		current.add(n1);
		current.add(n8);
		mResult.add(current);
		
		current = new ArrayList<BinaryTreeNode>();
		current.add(n2);
		current.add(n5);
		current.add(n9);
		current.add(n12);
		mResult.add(current);
		
		current = new ArrayList<BinaryTreeNode>();
		current.add(n3);
		current.add(n4);
		current.add(n6);
		current.add(n7);
		current.add(n10);
		current.add(n11);
		current.add(n13);
		current.add(n14);
		mResult.add(current);
	}

	@Test
	public void test() {
		List<List<BinaryTreeNode>> result = Question4.createLevelList(mRoot);
		Assert.assertEquals(mResult.size(), result.size());
		for(int i=0;i<result.size();i++){
			List<BinaryTreeNode> list = result.get(i);
			List<BinaryTreeNode> resultList = mResult.get(i);
			Assert.assertEquals(list.size(), resultList.size());
			for(int j=0;j<list.size();j++){
				Assert.assertEquals(list.get(j), resultList.get(j));
			}
		}
	}

}
