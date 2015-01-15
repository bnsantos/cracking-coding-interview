package com.bnsantos.chapter4;

import java.util.ArrayList;
import java.util.List;

import com.bnsantos.utils.GraphNode;

public class Question2 {
	public static boolean search(GraphNode from, GraphNode to){
		List<GraphNode> queue = new ArrayList<GraphNode>();
		List<String> visitedNodes = new ArrayList<String>();
		
		visitedNodes.add(from.toString());
		queue.add(from);
		
		GraphNode current;
		while(!queue.isEmpty()){
			current = queue.remove(0);
			if(current.getAdjacents()!=null){
				for(GraphNode adjacent: current.getAdjacents()){
					if(!visitedNodes.contains(adjacent.getId())){
						if(adjacent.getValue()==to.getValue()){
							return true;
						}else{
							visitedNodes.add(adjacent.getId());
							queue.add(adjacent);
						}	
					}
				}
			}
		}
		return false;
	}
}
