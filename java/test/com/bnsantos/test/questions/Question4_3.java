package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter4.Question3;
import com.bnsantos.utils.BinaryTreeNode;

public class Question4_3 {
	
	@Test
	public void test() {
		int array[] = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		Assert.assertEquals(" 0  1  2  3  4  5  6  7  8  9  10  11  12  13  14 ", 
				BinaryTreeNode.inOrderTraversal(Question3.minimalBSTTree(array)));
	}

}
