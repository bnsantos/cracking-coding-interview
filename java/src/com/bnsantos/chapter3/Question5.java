package com.bnsantos.chapter3;

import java.util.ArrayList;
import java.util.List;

public class Question5 {
	
	public static class MyQueue{
		private List<Integer> mNewestStack;
		private List<Integer> mOldestStack;
		private int mNewestTop;
		private int mOldestTop;
		
		public MyQueue(){
			mNewestStack = new ArrayList<Integer>();
			mOldestStack = new ArrayList<Integer>();
			
			mNewestTop = -1;
			mOldestTop = -1;
		}
		
		public int size(){
			return mNewestStack.size()+mOldestStack.size();
		}
		
		public void add(int i){
			mNewestStack.add(i);
			mNewestTop++;
		}
		
		public int remove(){
			if(mOldestTop!=-1){
				return mOldestStack.remove(mOldestTop--);
			}
			if(mNewestStack.size()==0){
				return -1;
			}
			shiftStacks();
			return remove();
		}
		
		private void shiftStacks(){
			for(;mNewestTop>=0;mNewestTop--){
				mOldestStack.add(mNewestStack.get(mNewestTop));
			}
			mNewestStack.clear();
			mOldestTop = mOldestStack.size()-1;
		}
	}

}

