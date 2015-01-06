package com.bnsantos.chapter2;

import java.util.List;

public class Question2 {
	public static int nthToLast(List<Integer> list, int n, StringBuffer elem){
		if(list.size()==0){
			return 0;
		}
		int k = nthToLast(list.subList(1, list.size()), n, elem) + 1;
		if(n==k){
			elem.append(list.get(0));
			System.out.println("Found: " + list.get(0));
		}
		return k;
	}

}
