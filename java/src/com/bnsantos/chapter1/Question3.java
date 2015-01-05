package com.bnsantos.chapter1;

import java.util.Arrays;

public class Question3 {
	public static boolean permutation(String s1, String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		return sort(s1).equals(sort(s2));
	}
	
	public static String sort(String s){
		char[] array = s.toCharArray();
		Arrays.sort(array);
		return new String(array);
	}
}
