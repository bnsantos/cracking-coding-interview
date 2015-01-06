package com.bnsantos.chapter2;

import java.util.ArrayList;
import java.util.List;

public class Question4 {
	public static List<Integer> partition(List<Integer> initial, int k){
		List<Integer> before = new ArrayList<Integer>();
		List<Integer> after = new ArrayList<Integer>();
		for(Integer i:initial){
			if(i.intValue()<k){
				before.add(i);
			}else{
				after.add(i);
			}
		}
		before.addAll(after);
		return before;
	}

}
