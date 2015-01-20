package com.bnsantos.chapter5;

public class Question5 {
	
	public static int bitSwap(int to, int from){
		int count=0;
		for(int c=to^from;c!=0;c=c&(c-1)){
			count++;
		}
		return count;
	}

}
