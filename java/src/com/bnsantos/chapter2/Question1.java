package com.bnsantos.chapter2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Question1 {

	//Just using structure of List, not using auxiliary methods provided by java (contains, indexOf, etc)
	public static List<Integer> removeDuplicates(List<Integer> unsorted){
		//Using auxiliary arraylist because cant remove while looping into arraylist
		List<Integer> noDup = new ArrayList<Integer>();
		HashMap<Integer, Integer> repeated = new HashMap<Integer, Integer>();
		for(Integer i:unsorted){
			if(!repeated.containsKey(i)){
				noDup.add(i);
				repeated.put(i, i);
			}
		}
		return noDup;
	}
	
	public static List<Integer> removeDuplicatesNoBuffer(List<Integer> unsorted){
		//Using auxiliary arraylist because cant remove while looping into arraylist
		List<Integer> noDup = new ArrayList<Integer>();
		boolean add = true;
		for(int i=0;i<unsorted.size();i++){
			add = true;
			for(int j=i+1;j<unsorted.size();j++){
				if(unsorted.get(i).intValue()==unsorted.get(j).intValue()){
					add = false;
					continue;
				}
			}
			if(add){
				noDup.add(unsorted.get(i));
			}
			
		}
		return noDup;
	}
}
