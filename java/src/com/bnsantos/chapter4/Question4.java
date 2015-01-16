package com.bnsantos.chapter4;

import java.util.ArrayList;
import java.util.List;

import com.bnsantos.utils.BinaryTreeNode;

public class Question4 {
	public static List<List<BinaryTreeNode>> createLevelList(BinaryTreeNode root){
		List<List<BinaryTreeNode>> result = new ArrayList<List<BinaryTreeNode>>();
		List<BinaryTreeNode> current = new ArrayList<BinaryTreeNode>();
		if(root!=null){
			current.add(root);
		}
		
		while(current.size()>0){
			result.add(current);
			List<BinaryTreeNode> parents = current;
			current = new ArrayList<BinaryTreeNode>();
			for(BinaryTreeNode node: parents){
				if(node.getLeft()!=null){
					current.add(node.getLeft());
				}
				if(node.getRight()!=null){
					current.add(node.getRight());
				}
			}
		}
		return result;
	}
}
