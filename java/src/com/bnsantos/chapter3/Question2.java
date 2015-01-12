package com.bnsantos.chapter3;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
	
	public static class StackWithMin{
		private List<Integer> mStack;
		private List<Integer> mMinStack;
		private int mTop;
		private int mTopMin;
		
		public StackWithMin(){
			mStack = new ArrayList<Integer>();
			mMinStack = new ArrayList<Integer>();
			mTop = -1;
			mTopMin = -1;
		}
		
		public void push(int value){
			mStack.add(value);
			mTop++;
			if(value<=min()){
				mMinStack.add(value);
				mTopMin++;
			}
		}
		
		public int pop() throws Exception{
			if(mTop-1<0){
				throw new Exception("Stack empty");
			}
			int pop = mStack.remove(mTop--);
			if(pop==min()){
				if(mTopMin-1<0){
					throw new Exception("Stack empty");
				}
				mMinStack.remove(mTopMin--);
			}
			return pop;
		}
		
		public int min(){
			if(mTopMin==-1){
				return Integer.MAX_VALUE;
			}else{
				return mMinStack.get(mTopMin);
			}
		}
		
		
	}

}
