package com.bnsantos.chapter2;

import java.util.ArrayList;
import java.util.List;

public class Question5 {
	public static List<Integer> addForward(List<Integer> l1, List<Integer> l2){
		List<Integer> result = new ArrayList<Integer>();
		String resultString = Integer.toString(Integer.parseInt(getNumberForward(l1)) + Integer.parseInt(getNumberForward(l2)));
		for(int i=0;i<resultString.length();i++){
			result.add(Integer.parseInt(resultString.substring(i, i+1)));
		}
		return result;
	}
	
	public static String getNumberForward(List<Integer> list){
		StringBuffer number = new StringBuffer();
		for(Integer i:list){
			number.append(i);
		}
		return number.toString();
	}
	
	public static List<Integer> addReverse(List<Integer> l1, List<Integer> l2){
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> aux;
		String resultString = Integer.toString(Integer.parseInt(getNumberReverse(l1)) + Integer.parseInt(getNumberReverse(l2)));
		
		for(int i=0;i<resultString.length();i++){
			aux = result;
			result = new ArrayList<Integer>();
			result.add(Integer.parseInt(resultString.substring(i, i+1)));
			result.addAll(aux);
		}
		return result;
	}
	
	public static String getNumberReverse(List<Integer> list){
		String number = "";
		for(Integer i:list){
			number = i.toString() + number;
		}
		return number;
	}
}
