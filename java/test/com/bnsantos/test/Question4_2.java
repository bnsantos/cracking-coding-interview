package com.bnsantos.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bnsantos.chapter4.Question2;
import com.bnsantos.utils.GraphNode;

public class Question4_2 {
	private List<GraphNode> mGraph;
	private GraphNode mA, mB, mC, mD, mE, mF, mG, mH;
	
	@Before
	public void init(){
		GraphNode n1 = new GraphNode(1);
		GraphNode n2 = new GraphNode(2);
		GraphNode n3 = new GraphNode(3);
		GraphNode n4 = new GraphNode(4);
		GraphNode n5 = new GraphNode(5);
		GraphNode n6 = new GraphNode(6);
		GraphNode n7 = new GraphNode(7);
		GraphNode n8 = new GraphNode(8);
		GraphNode n9 = new GraphNode(9);
		GraphNode n10 = new GraphNode(10);
		GraphNode n11 = new GraphNode(11);
		GraphNode n12 = new GraphNode(12);
		
		mGraph = new ArrayList<GraphNode>();
		mGraph.add(n1);
		mGraph.add(n2);
		mGraph.add(n3);
		mGraph.add(n3);
		mGraph.add(n4);
		mGraph.add(n5);
		mGraph.add(n6);
		mGraph.add(n7);
		mGraph.add(n8);
		mGraph.add(n9);
		mGraph.add(n10);
		mGraph.add(n11);
		mGraph.add(n12);
		
		n1.addEdge(n2);
		n1.addEdge(n3);
		
		n2.addEdge(n1);
		n2.addEdge(n3);
		n2.addEdge(n4);
		n2.addEdge(n5);
		
		n3.addEdge(n1);
		n3.addEdge(n2);
		n3.addEdge(n6);
		
		n4.addEdge(n2);
		
		n5.addEdge(n2);
		
		n6.addEdge(n3);
		
		n7.addEdge(n10);
		n7.addEdge(n11);

		n8.addEdge(n10);
		n8.addEdge(n12);
		
		n9.addEdge(n10);
		n9.addEdge(n11);
		
		n10.addEdge(n7);
		n10.addEdge(n8);
		n10.addEdge(n9);
		
		n11.addEdge(n7);
		n11.addEdge(n9);
		
		n12.addEdge(n8);
		
		mA = n3;
		mB = n6;
		
		mC = n2;
		mD = n9;
		
		mE = n7;
		mF = n12;
		
		mG = n11;
		mH = n3;
	}

	@Test
	public void testPath() {
		Assert.assertTrue(Question2.search(mA, mB));
		Assert.assertTrue(Question2.search(mE, mF));
		
		Assert.assertTrue(Question2.search(mB, mA));
		Assert.assertTrue(Question2.search(mF, mE));
	}
	
	@Test
	public void testNoPath() {
		Assert.assertFalse(Question2.search(mC, mD));
		Assert.assertFalse(Question2.search(mG, mH));
		
		Assert.assertFalse(Question2.search(mD, mC));
		Assert.assertFalse(Question2.search(mH, mG));
	}

}
