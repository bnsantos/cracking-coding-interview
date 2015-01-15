package com.bnsantos.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GraphNode {
	private final String mId;
	private final int mValue;
	private List<GraphNode> mAdjacents;
	
	public GraphNode(int value){
		mId = UUID.randomUUID().toString();
		mValue = value;
		mAdjacents = new ArrayList<GraphNode>();
	}
	
	public String getId() {
		return mId;
	}

	public void addEdge(GraphNode n){
		if(!mAdjacents.contains(n)){
			mAdjacents.add(n);
		}
	}
	
	public List<GraphNode> getAdjacents(){
		return mAdjacents;
	}
	
	public boolean remove(GraphNode n){
		return mAdjacents.remove(n);
	}

	public int getValue() {
		return mValue;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof GraphNode && mValue == ((GraphNode)obj).mValue;
	}
}
